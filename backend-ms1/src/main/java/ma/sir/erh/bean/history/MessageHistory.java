package ma.sir.erh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.erh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "message")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="message_seq",sequenceName="message_seq",allocationSize=1, initialValue = 1)
public class MessageHistory extends HistBusinessObject  {


    public MessageHistory() {
    super();
    }

    public MessageHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="message_seq")
    public Long getId() {
    return id;
    }
}

