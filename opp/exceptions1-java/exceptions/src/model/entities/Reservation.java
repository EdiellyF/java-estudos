package model.entities;

import model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private  Integer roomNumber;
    private Date checkIn;
    private Date checkiOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation() {
    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkiOut)  throws DomainException {
        if(!checkiOut.after(checkIn)) {
            throw  new DomainException( "Error in reservation: Check-out date must be after check-in date");
        }
        setRoomNumber(roomNumber);
        this.checkIn = checkIn;
        this.checkiOut = checkiOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckiOut() {
        return checkiOut;
    }

    public long duration(){
        long diff = checkiOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void upDates(Date checkIn, Date checkiOut) throws DomainException {
        Date now = new Date();
        if(checkIn.before(now) || checkiOut.before(now)) {
            throw  new DomainException("Error in reservation: Reservation dates for update must be future dates");
        }
        if(!checkiOut.after(checkIn)) {
            throw  new DomainException( "Error in reservation: Check-out date must be after check-in date");
        }

        this.checkIn = checkIn;
        this.checkiOut = checkiOut;


    }


    @Override
    public String toString() {
        return "Room "
                + roomNumber
                + ", CheckIn: " +
                sdf.format(checkIn) +
                ", check-out: " +
                sdf.format(checkiOut) +
                " " +
                duration() +
                " nights";
    }
}
