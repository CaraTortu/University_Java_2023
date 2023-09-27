use super::{card::CreditCard, name::Name};

#[derive(PartialEq, Eq, Debug)]
pub enum Person {
    Passenger {
        name: Name,
        phone_number: String,
        email_address: String,
        no_bags: u8,
        priority_boarding: bool,
        credit_card: CreditCard,
    },
    Employee,
}
