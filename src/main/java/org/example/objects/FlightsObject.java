package org.example.objects;
// класс формирует объект через внутр класс билдер

public final class FlightsObject {
    private final String dayOfMonth;
    private final String dayOfWeek;
    private final String flightDate;
    private final String uniqueCarrier;
    private final String tailNum;
    private final String originAirportID;
    private final String origin;
    private final String originStateName;
    private final String destAirportID;
    private final String dest;
    private final String destStateName;
    private final String depTime;
    private final String depDelay;
    private final String wheelsOff;
    private final String wheelsOn;
    private final String arrTime;
    private final String arrDelay;
    private final String cancelled;
    private final String cancellationCode;
    private final String diverted;
    private final String airTime;
    private final String distance;
// формирование объекта через билдер
    private FlightsObject(FlightsObjectBuilder builder) {
        this.dayOfMonth = builder.dayOfMonth;
        this.dayOfWeek = builder.dayOfWeek;
        this.flightDate = builder.flightDate;
        this.uniqueCarrier = builder.uniqueCarrier;
        this.tailNum = builder.tailNum;
        this.originAirportID = builder.originAirportID;
        this.origin = builder.origin;
        this.originStateName = builder.originStateName;
        this.destAirportID = builder.destAirportID;
        this.dest = builder.dest;
        this.destStateName = builder.destStateName;
        this.depTime = builder.depTime;
        this.depDelay = builder.depDelay;
        this.wheelsOff = builder.wheelsOff;
        this.wheelsOn = builder.wheelsOn;
        this.arrTime = builder.arrTime;
        this.arrDelay = builder.arrDelay;
        this.cancelled = builder.cancelled;
        this.cancellationCode = builder.cancellationCode;
        this.diverted = builder.diverted;
        this.airTime = builder.airTime;
        this.distance = builder.distance;
    }

    // Геттеры
    public String getDayOfMonth() { return dayOfMonth; }
    public String getDayOfWeek() { return dayOfWeek; }
    public String getFlightDate() { return flightDate; }
    public String getUniqueCarrier() { return uniqueCarrier; }
    public String getTailNum() { return tailNum; }
    public String getOriginAirportID() { return originAirportID; }
    public String getOrigin() { return origin; }
    public String getOriginStateName() { return originStateName; }
    public String getDestAirportID() { return destAirportID; }
    public String getDest() { return dest; }
    public String getDestStateName() { return destStateName; }
    public String getDepTime() { return depTime; }
    public String getDepDelay() { return depDelay; }
    public String getWheelsOff() { return wheelsOff; }
    public String getWheelsOn() { return wheelsOn; }
    public String getArrTime() { return arrTime; }
    public String getArrDelay() { return arrDelay; }
    public String getCancelled() { return cancelled; }
    public String getCancellationCode() { return cancellationCode; }
    public String getDiverted() { return diverted; }
    public String getAirTime() { return airTime; }
    public String getDistance() { return distance; }

    public static FlightsObjectBuilder builder() {
        return new FlightsObjectBuilder();
    }
// класс билдер
protected final static class FlightsObjectBuilder {
        private String dayOfMonth;
        private String dayOfWeek;
        private String flightDate;
        private String uniqueCarrier;
        private String tailNum;
        private String originAirportID;
        private String origin;
        private String originStateName;
        private String destAirportID;
        private String dest;
        private String destStateName;
        private String depTime;
        private String depDelay;
        private String wheelsOff;
        private String wheelsOn;
        private String arrTime;
        private String arrDelay;
        private String cancelled;
        private String cancellationCode;
        private String diverted;
        private String airTime;
        private String distance;

    public FlightsObjectBuilder dayOfMonth(String dayOfMonth) {
            this.dayOfMonth = dayOfMonth;
            return this;
        }

    public FlightsObjectBuilder dayOfWeek(String dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }

    public FlightsObjectBuilder flightDate(String flightDate) {
            this.flightDate = flightDate;
            return this;
        }

    public FlightsObjectBuilder uniqueCarrier(String uniqueCarrier) {
            this.uniqueCarrier = uniqueCarrier;
            return this;
        }

    public FlightsObjectBuilder tailNum(String tailNum) {
            this.tailNum = tailNum;
            return this;
        }

    public FlightsObjectBuilder originAirportID(String originAirportID) {
            this.originAirportID = originAirportID;
            return this;
        }

    public FlightsObjectBuilder origin(String origin) {
            this.origin = origin;
            return this;
        }

    public FlightsObjectBuilder originStateName(String originStateName) {
            this.originStateName = originStateName;
            return this;
        }

    public FlightsObjectBuilder destAirportID(String destAirportID) {
            this.destAirportID = destAirportID;
            return this;
        }

    public FlightsObjectBuilder dest(String dest) {
            this.dest = dest;
            return this;
        }

    public FlightsObjectBuilder destStateName(String destStateName) {
            this.destStateName = destStateName;
            return this;
        }

    public FlightsObjectBuilder depTime(String depTime) {
            this.depTime = depTime;
            return this;
        }

    public FlightsObjectBuilder depDelay(String depDelay) {
            this.depDelay = depDelay;
            return this;
        }

    public FlightsObjectBuilder wheelsOff(String wheelsOff) {
            this.wheelsOff = wheelsOff;
            return this;
        }

    public FlightsObjectBuilder wheelsOn(String wheelsOn) {
            this.wheelsOn = wheelsOn;
            return this;
        }

    public FlightsObjectBuilder arrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }

    public FlightsObjectBuilder arrDelay(String arrDelay) {
            this.arrDelay = arrDelay;
            return this;
        }

    public FlightsObjectBuilder cancelled(String cancelled) {
            this.cancelled = cancelled;
            return this;
        }

    public FlightsObjectBuilder cancellationCode(String cancellationCode) {
            this.cancellationCode = cancellationCode;
            return this;
        }

    public FlightsObjectBuilder diverted(String diverted) {
            this.diverted = diverted;
            return this;
        }

    public FlightsObjectBuilder airTime(String airTime) {
            this.airTime = airTime;
            return this;
        }

    public FlightsObjectBuilder distance(String distance) {
            this.distance = distance;
            return this;
        }

        public FlightsObject build() {
           return new FlightsObject(this);
        }
    }
}
