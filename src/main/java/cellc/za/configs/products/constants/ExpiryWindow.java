package cellc.za.configs.products.constants;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author Bushy Netshidaulu
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
@Entity
@Table(name="PC_EXPIRY_WINDOW")
public class ExpiryWindow {
    @Id
    @GeneratedValue(
        strategy = GenerationType.IDENTITY
    )
    private Long id;
    private Integer expiryWindow;
}