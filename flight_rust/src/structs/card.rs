use std::fmt::Debug;

use super::date::Date;

#[derive(PartialEq, Eq)]
pub struct CreditCard {
    number: String,
    expiry_date: Date,
    security_code: u16,
}

impl Debug for CreditCard {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        write!(
            f,
            "Number: {} | Expiry: {:?} | CVV: {}",
            self.number, self.expiry_date, self.security_code
        )
    }
}

impl CreditCard {
    pub fn new(number: String, expiry_date: Date, security_code: u16) -> Self {
        Self {
            number,
            expiry_date,
            security_code,
        }
    }

    pub fn get_number(&self) -> &str {
        &self.number
    }
}
