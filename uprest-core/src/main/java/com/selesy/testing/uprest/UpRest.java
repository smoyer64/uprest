package com.selesy.testing.uprest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.extension.ExtendWith;

import com.selesy.testing.uprest.resolvers.ByteArrayEntityBodyResolver;
import com.selesy.testing.uprest.resolvers.HttpRequestResolver;
import com.selesy.testing.uprest.resolvers.HttpResponseResolver;
import com.selesy.testing.uprest.resolvers.PerformanceResolver;
import com.selesy.testing.uprest.resolvers.StatusLineResolver;
import com.selesy.testing.uprest.resolvers.StringEntityBodyResolver;

/**
 * The UpRest meta-annotation allows all the upREST ParameterResolvers to be
 * applied to a test class with a single annotation.
 * 
 * TODO - Example code
 * 
 * @author Steve Moyer &lt;smoyer1@selesy.com&gt;
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@ExtendWith({
  ByteArrayEntityBodyResolver.class,
  HttpRequestResolver.class,
  HttpResponseResolver.class,
  PerformanceResolver.class,
  StatusLineResolver.class,
  StringEntityBodyResolver.class
})
public @interface UpRest {

}
