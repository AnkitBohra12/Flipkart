🛒 Flipkart End-to-End Automation Project

This project automates the end-to-end testing of Flipkart’s web application using Java, Selenium, Cucumber, and Maven. It covers core e-commerce flows including search, filter, add-to-cart.

🚀 Tech Stack

Programming Language: Java

Automation Tool: Selenium WebDriver

BDD Framework: Cucumber

Build Tool: Maven

Test Runner: JUnit

Reporting: Cucumber HTML Reports / Extent Reports

📌 Features Automated

🔍 Product Search – search items by keyword

🏷️ Product Filters – apply brand, price, and category filters

↕ Product Sorting – sort items by relevance, price, ratings, etc.

🛒 Add to Cart – add one or multiple items to cart

👤 User Login / Logout – authenticate with valid and invalid credentials

💳 Checkout Flow – proceed to checkout (dummy payment integration if needed)

✅ Validation Checks – page titles, element visibility, price updates

📂 Project Structure
Flipkart-Automation/
│── src
│   ├── main/java
│   │   ├── utilities/        # Common utilities (driver setup, config)
│   │   └── pages/            # Page Object Model classes
│   │
│   └── test/java
│       ├── stepDefinitions/  # Step definition files for Cucumber
│       ├── runners/          # Cucumber runner classes
│       └── features/         # Cucumber feature files
│
│── pom.xml                   # Maven dependencies
│── README.md                 # Project documentation

⚙️ Prerequisites

Install Java 11+

Install Maven

Install IntelliJ / Eclipse IDE

Install Chrome Browser & matching ChromeDriver

View reports:

target/cucumber-reports/index.html

🔮 Future Enhancements

CI/CD pipeline integration (Jenkins/GitHub Actions)

Add API-level testing for backend validation

Extend to mobile automation (Appium)

Parallel test execution for faster runs
