package cellc.za.configs.products.constants;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
@Entity
@Table(name="PC_Queues")
public class Queues {

    @Id @GeneratedValue(
      strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String queue;
}
