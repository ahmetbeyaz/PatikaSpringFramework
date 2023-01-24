package com.ahmetbeyaz.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

//cdi==>bean
@jakarta.inject.Named
@ApplicationScoped
public class Named {

    private  Long namedId;
    private  String NamedData="Merhaba cdi Named Yapısını Ogreniyorum";
}
