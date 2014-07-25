import org.springframework.security.web.authentication.Http403ForbiddenEntryPoint

// Place your Spring DSL code here
beans = {

    // override default spring security config and force 403 for all unauthenticated requests
    authenticationEntryPoint(Http403ForbiddenEntryPoint)

}
