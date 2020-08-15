package com.schedule.kotlin

import com.schedule.kotlin.entity.user.User
import com.schedule.kotlin.services.UserService
import org.jboss.resteasy.spi.ApplicationException
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.Application
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
class ExampleResource {

    @Inject
    private lateinit var userService: UserService

    @GET
    fun findAll(): Response {
        val response = userService.findAll()

        try {
            if (response.isEmpty())
                return Response.noContent().entity("nada").build()
            return Response.ok(response).build()
        } catch (e: ApplicationException) {
            return Response.serverError().build()
        }
    }
}