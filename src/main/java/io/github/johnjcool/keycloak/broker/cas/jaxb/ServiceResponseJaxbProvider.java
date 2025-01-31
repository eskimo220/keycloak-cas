package io.github.johnjcool.keycloak.broker.cas.jaxb;

import io.github.johnjcool.keycloak.broker.cas.model.ServiceResponse;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.ext.Provider;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import org.jboss.resteasy.plugins.providers.jaxb.AbstractJAXBProvider;

@Provider
@Consumes(value = {MediaType.WILDCARD})
public class ServiceResponseJaxbProvider extends AbstractJAXBProvider<ServiceResponse> {

  @Override
  protected boolean isReadWritable(
      final Class<?> type,
      final Type genericType,
      final Annotation[] annotations,
      final MediaType mediaType) {
    return type == ServiceResponse.class;
  }
}
