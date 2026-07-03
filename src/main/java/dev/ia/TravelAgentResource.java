package dev.ia;

import jakarta.inject.Inject;

import jakarta.ws.rs.*;

import jakarta.ws.rs.core.MediaType;

@Path("/travel")
public class TravelAgentResource {

    @Inject
    TravelAgentAssistant assistant;

    @GET
    public String verify(){
        return "Serviço INICIALIZADO!!!";
    }

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String ask(String question) {

        return assistant.chat(question);
    }


}