package org.Boizz.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.xml.bind.annotation.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "kunde")
@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT, use = JsonTypeInfo.Id.NAME)
@JsonTypeName(value = "kunde")
public class Kunde {
	@XmlAttribute
	@JsonProperty
	private int id;
	@XmlElement
	@JsonProperty
	private String firstName;
	@XmlElement
	@JsonProperty
	private String lastName;
}
