package esgi.common.dto;

import java.util.UUID;
import java.time.LocalDate;

public class TicketFullDto {

    private UUID uuidTicket;
    private String title;
    private String description;
    private UUID uuidCreator;
    private UUID uuidAssignee;
    private String status;
    private LocalDate dateTicketCreation;
    private LocalDate dateExpectedResolution;


    public TicketFullDto(UUID uuidTicket, String title, String description, UUID uuidCreator, UUID uuidAssignee, String status, LocalDate dateTicketCreation, LocalDate dateExpectedResolution) {
        this.uuidTicket = uuidTicket;
        this.title = title;
        this.description = description;
        this.uuidCreator = uuidCreator;
        this.uuidAssignee = uuidAssignee;
        this.status = status;
        this.dateTicketCreation = dateTicketCreation;
        this.dateExpectedResolution = dateExpectedResolution;
    }

    public TicketFullDto (final java.util.UUID uuidTicket) {
        this.uuidTicket = uuidTicket;
    }

    public TicketFullDto () {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public java.util.UUID getUuidTicket () {
        return uuidTicket;
    }

    public void setUuidTicket (final java.util.UUID uuidTicket) {
        this.uuidTicket = uuidTicket;
    }

    public java.util.UUID getUuidCreator () {
        return uuidCreator;
    }

    public void setUuidCreator (final java.util.UUID uuidCreator) {
        this.uuidCreator = uuidCreator;
    }

    public java.util.UUID getUuidAssignee () {
        return uuidAssignee;
    }

    public void setUuidAssignee (final java.util.UUID uuidAssignee) {
        this.uuidAssignee = uuidAssignee;
    }

    public String getStatus () {
        return status;
    }

    public void setStatus (final String status) {
        this.status = status;
    }

    public java.time.LocalDate getDateTicketCreation () {
        return dateTicketCreation;
    }

    public void setDateTicketCreation (final java.time.LocalDate dateTicketCreation) {
        this.dateTicketCreation = dateTicketCreation;
    }

    public java.time.LocalDate getDateExpectedResolution () {
        return dateExpectedResolution;
    }

    public void setDateExpectedResolution (final java.time.LocalDate dateExpectedResolution) {
        this.dateExpectedResolution = dateExpectedResolution;
    }
}
