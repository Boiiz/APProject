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
@XmlRootElement(name = "ablesung")
@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT, use = JsonTypeInfo.Id.NAME)
@JsonTypeName(value = "ablesung")
public class Ablesung {
	@XmlAttribute
	@JsonProperty
	private int userID;
	@XmlElement
	@JsonProperty
	private String zaehlerArt;
	@XmlElement
	@JsonProperty
	private String zaehlerId;
	@XmlElement
	@JsonProperty
	private String date;
	@XmlElement
	@JsonProperty
	private String isNew;
	@XmlElement
	@JsonProperty
	private String zaehlerStand;
	@XmlElement
	@JsonProperty
	private String comment;
}
