package nvtu.lscexp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Metadata")
public class Metadata {
    
    @Id private String id;
    private String date;
    private String local_time;
    private String part_of_day;
    private String day_of_week;
    private String location_address;
    private String location_type;
    
    public Metadata() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocal_time() {
        return local_time;
    }

    public void setLocal_time(String local_time) {
        this.local_time = local_time;
    }

    public String getPart_of_day() {
        return part_of_day;
    }

    public void setPart_of_day(String part_of_day) {
        this.part_of_day = part_of_day;
    }

    public String getDay_of_week() {
        return day_of_week;
    }

    public void setDay_of_week(String day_of_week) {
        this.day_of_week = day_of_week;
    }

    public String getLocation_address() {
        return location_address;
    }

    public void setLocation_address(String location_address) {
        this.location_address = location_address;
    }

    public String getLocation_type() {
        return location_type;
    }

    public void setLocation_type(String location_type) {
        this.location_type = location_type;
    }

    

}
