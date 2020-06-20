package org.chrimson.me.messenger.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

import org.chrimson.me.messenger.service.MessageService;
import org.chrimson.me.messenger.model.Message;

@Path("/messages")

public class MessageResource {
        MessageService messageService = new MessageService();

@GET
@Produces(MediaType.APPLICATION_JSON)

public List<Message> getMessages(@QueryParam("year") int year, 
	                           	@QueryParam("start") int start,
	                           	@QueryParam("size") int size) {
	if(year > 0){
		return messageService.getAllMessagesForYear(year);
		}
	if(start >= 0 && size >0) {
		return messageService.getAllMessagePaginated(start, size);
		}
return messageService.getAllMessages();
}

////////////////////////////////

@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public Message addMessage(Message message)
{
return messageService.addMessage(message);
}
///////////////////////////////
@PUT
@Path("/{messageID}")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public Message updateMessage(@PathParam("messageID") long id, Message message) {
message.setId(id);
return messageService.updateMessage(message);
}
/////////////////////////////
@DELETE
@Path("/{messageID}")
@Produces(MediaType.APPLICATION_JSON)
public void deleteMessage(@PathParam("messageID") long id)
{
messageService.removeMessage(id);
}

@GET
@Path("/{messageID}")
@Produces(MediaType.APPLICATION_JSON)

public Message getMessage(@PathParam("messageID") long messageID)
{
return messageService.getMessage(messageID);
}



}
