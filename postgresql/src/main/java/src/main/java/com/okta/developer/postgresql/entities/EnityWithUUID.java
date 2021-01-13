package src.main.java.com.okta.developer.postgresql.entities;

import java.util.UUID;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnityWithUUID {
	@Id @org.hibernate.annotations.Type(type = "pg-uuid")
	private UUID id;
	

}
