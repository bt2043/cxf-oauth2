package com.ericsson.ecanzho.cxf_oauth2.common.json;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;
import java.io.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/**
 * Created by ecanzho on 6/12/2016.
 */
@Component
public class GsonProvider<T> implements MessageBodyReader<T>, MessageBodyWriter<T> {

    @Autowired
    private Gson gson;

    public boolean isReadable(Class aClass, Type type, Annotation[] annotations, MediaType mediaType) {
        return true;
    }

    public Object readFrom(Class aClass, Type type, Annotation[] annotations, MediaType mediaType, MultivaluedMap multivaluedMap, InputStream inputStream) throws IOException, WebApplicationException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        try {
            return gson.fromJson(inputStreamReader, type);
        } finally {
            inputStreamReader.close();
        }
    }

    public boolean isWriteable(Class aClass, Type type, Annotation[] annotations, MediaType mediaType) {
        return true;
    }

    public long getSize(Object o, Class aClass, Type type, Annotation[] annotations, MediaType mediaType) {
        return -1;
    }


    public void writeTo(T t, Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, Object> multivaluedMap, OutputStream outputStream) throws IOException, WebApplicationException {
        PrintWriter printWriter = new PrintWriter(outputStream);
        try {
            String json = gson.toJson(t);
            printWriter.write(json);
            printWriter.flush();
        } finally {
            printWriter.close();
        }
    }
}
