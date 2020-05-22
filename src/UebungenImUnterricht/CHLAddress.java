package UebungenImUnterricht;

public class CHLAddress {

        private String street;
        private String zip;
        private String city;
        private String country;

        public CHLAddress(String street, String zip, String city, String country) {
            this.street = street;
            this.zip = zip;
            this.city = city;
            this.country = country;
        }

    public String getStreet() {
            return street;
    }

    public String getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
        public String toString() {
            return "CHLAddress{" +
                    "street='" + street + '\'' +
                    ", zip='" + zip + '\'' +
                    ", city='" + city + '\'' +
                    ", country='" + country + '\'' +
                    '}';
        }

}
