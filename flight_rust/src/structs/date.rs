use std::fmt::Debug;

#[derive(PartialEq, Eq)]
pub struct Date {
    pub day: u8,
    pub month: u8,
    pub year: u32,
}

impl Debug for Date {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        write!(f, "{}/{}/{}", self.day, self.month, self.year)
    }
}

impl Default for Date {
    fn default() -> Self {
        Self {
            day: 1,
            month: 1,
            year: 1970,
        }
    }
}

impl Date {
    pub fn new(day: u8, month: u8, year: u32) -> Self {
        Self { day, month, year }
    }
}
