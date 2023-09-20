use std::fmt::Debug;

pub struct Name {
    pub title: String,
    pub first_name: String,
    pub last_name: String
}

impl Debug for Name {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result { 
        write!(f, "{} {} {}", self.title, self.first_name, self.last_name)
    }
}

impl PartialEq for Name {
    fn eq(&self, other: &Self) -> bool {
        self.title == other.title &&
            self.first_name == other.first_name &&
            self.last_name == other.last_name
    }
}

impl Name {
    pub fn new(title: &str, first_name: &str, last_name: &str) -> Self {
        Self {
            title: title.into(),
            first_name: first_name.into(),
            last_name: last_name.into()
        }
    }

    pub fn is_female(&self) -> bool {
        match self.title.to_lowercase().as_str() {
            "ms" | "mrs" | "miss" => true,
            _ => false
        } 
    }
}

#[cfg(test)]
mod test {
    use super::Name;

    #[test]
    fn test_eq() {
        let person_a: Name = Name::new("Mr", "Homer", "Simpson");
        let person_b: Name = Name::new("Ms", "Marie", "Boyle");
        let person_c: Name = Name::new("Mr", "Homer", "Simpson");

        assert_eq!(person_a == person_b, false);
        assert_eq!(person_a == person_c, true);
    }  

    #[test]
    fn test_is_female() {
        let mut person_a: Name = Name::new("Mr", "Homer", "Simpson");

        assert_eq!(person_a.is_female(), false);

        person_a.title = "Ms".into();
        assert_eq!(person_a.is_female(), true);
    }
}
