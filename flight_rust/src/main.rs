mod structs;

use structs::{card::CreditCard, date::Date, name::Name};

use self::structs::person::Person;

fn main() {
    let passenger: Person = Person::Passenger {
        name: Name::new("Mr", "Homer", "Simpson"),
        phone_number: "0892739273".into(),
        email_address: "homer.simpson@atu.ie".into(),
        no_bags: 12,
        priority_boarding: true,
        credit_card: CreditCard::new("2837493726483746".into(), Date::new(23, 4, 2025), 173),
    };
    

    println!("{:?}", passenger);
}
