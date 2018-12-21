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
@XmlRootElement
@Entity @Table(name="PC_PRODUCT_CONFIG")
public class ProductConfig implements Serializable {

    private static final long SerialVersionUID = 1L;
    @Id @GeneratedValue(
       strategy = GenerationType.AUTO
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

    public ProductConfig(String pc_operation, String pc_prod_code,
                         String pc_prod_desc, String pc_tarrif_plan_id,
                         Integer pc_expiry_window, Integer pc_process_id,
                         String pc_opp_type, Date pc_modified_date, String pc_modified_by,
                         Date pc_created_date, String pc_created_by,
                         String pc_channel, Integer pc_abuse_limit,
                         Integer pc_use_limit, String pc_result1,
                         String pc_result2, String pc_result3,
                         String pc_SMS1, String pc_SMS2, String pc_SMS3, Integer pc_pending_limit,
                         String pc_sub_type_list, String pc_queue, String pc_param1, String pc_param2,
                         String pc_param3, String pc_param4, String pc_param5, String pc_param6,
                         String pc_start_time, String pc_end_time, String pc_days_of_week, Integer pc_value,
                         String pc_result4, String pc_result5, String pc_result6, String pc_SMS4,
                         String pc_SMS5, String pc_SMS6, Integer pc_delay, Integer pc_auth_flag,
                         Integer pc_weekly_use_limit, Integer pc_monthly_use_limit,
                         Integer pc_yearly_use_limit, String pc_exc_flag, Integer pc_cc_uid,
                         Integer pc_flow_id, Integer pc_realtime) {
        this.pc_operation = pc_operation;
        this.pc_prod_code = pc_prod_code;
        this.pc_prod_desc = pc_prod_desc;
        this.pc_tarrif_plan_id = pc_tarrif_plan_id;
        this.pc_expiry_window = pc_expiry_window;
        this.pc_process_id = pc_process_id;
        this.pc_opp_type = pc_opp_type;
        this.pc_modified_date = pc_modified_date;
        this.pc_modified_by = pc_modified_by;
        this.pc_created_date = pc_created_date;
        this.pc_created_by = pc_created_by;
        this.pc_channel = pc_channel;
        this.pc_abuse_limit = pc_abuse_limit;
        this.pc_use_limit = pc_use_limit;
        this.pc_result1 = pc_result1;
        this.pc_result2 = pc_result2;
        this.pc_result3 = pc_result3;
        this.pc_SMS1 = pc_SMS1;
        this.pc_SMS2 = pc_SMS2;
        this.pc_SMS3 = pc_SMS3;
        this.pc_pending_limit = pc_pending_limit;
        this.pc_sub_type_list = pc_sub_type_list;
        this.pc_queue = pc_queue;
        this.pc_param1 = pc_param1;
        this.pc_param2 = pc_param2;
        this.pc_param3 = pc_param3;
        this.pc_param4 = pc_param4;
        this.pc_param5 = pc_param5;
        this.pc_param6 = pc_param6;
        this.pc_start_time = pc_start_time;
        this.pc_end_time = pc_end_time;
        this.pc_days_of_week = pc_days_of_week;
        this.pc_value = pc_value;
        this.pc_result4 = pc_result4;
        this.pc_result5 = pc_result5;
        this.pc_result6 = pc_result6;
        this.pc_SMS4 = pc_SMS4;
        this.pc_SMS5 = pc_SMS5;
        this.pc_SMS6 = pc_SMS6;
        this.pc_delay = pc_delay;
        this.pc_auth_flag = pc_auth_flag;
        this.pc_weekly_use_limit = pc_weekly_use_limit;
        this.pc_monthly_use_limit = pc_monthly_use_limit;
        this.pc_yearly_use_limit = pc_yearly_use_limit;
        this.pc_exc_flag = pc_exc_flag;
        this.pc_cc_uid = pc_cc_uid;
        this.pc_flow_id = pc_flow_id;
        this.pc_realtime = pc_realtime;
    }
}