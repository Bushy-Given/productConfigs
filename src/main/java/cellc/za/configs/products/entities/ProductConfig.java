package cellc.za.configs.products.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Type;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
@Entity @Table(name="PC_PRODUCT_CONFIG")
public class ProductConfig implements Serializable {

    private static final long SerialVersionUID = 1L;
    @Id @GeneratedValue(
       strategy = GenerationType.SEQUENCE
    )
    private Long pc_uid;
    private String pc_operation;
    private String pc_prod_code;
    private String pc_prod_desc;
    private String pc_tarrif_plan_id;
    private Integer pc_expiry_window;
    private Integer pc_process_id=10000;
    private String pc_opp_type;
    @Temporal(TemporalType.DATE)
    @LastModifiedDate
    private Date pc_modified_date =new Date();
    private String pc_modified_by="OM_ORDER";
    @Type(type = "date")
    @Temporal(TemporalType.DATE)
    private Date pc_created_date = new Date();
    private String pc_created_by="OM_ORDER";
    private String pc_channel;
    private Integer pc_abuse_limit=10;
    private Integer pc_use_limit;
    private String pc_result1;
    private String pc_result2;
    private String pc_result3;
    private String pc_SMS1;
    private String pc_SMS2;
    private String pc_SMS3;
    private Integer pc_pending_limit=1;
    private String pc_sub_type_list;
    private String pc_queue;
    private String pc_param1="1";
    private String pc_param2="1";
    private String pc_param3="1";
    private String pc_param4="1";
    private String pc_param5="1";
    private String pc_param6="1";
    private String pc_start_time="000000";
    private String pc_end_time="235959";
    private String pc_days_of_week="1234567";
    private Integer pc_value;
    private String pc_result4="RESULT4";
    private String pc_result5;
    private String pc_result6="RESULT6";
    private String pc_SMS4="NONE";
    private String pc_SMS5="NONE";
    private String pc_SMS6="NONE";
    private Integer pc_delay=0;
    private Integer pc_auth_flag=0;
    private Integer pc_weekly_use_limit=10000;
    private Integer pc_monthly_use_limit=100000;
    private Integer pc_yearly_use_limit=1000000;
    private String pc_exc_flag;
    private Integer pc_cc_uid=0;
    private Integer pc_flow_id=0;
    private Integer pc_realtime=0;
}