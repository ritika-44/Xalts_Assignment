# Xalts_Assignment
Welcome to the GitHub repository for my **QA Test Assessment** for **Xalts**. This project is split into two major parts:

📁 **Part 1 – Test Planning**  
📁 **Part 2 – Automation Testing**

It demonstrates a complete test lifecycle from **test strategy and documentation** to **end-to-end automation implementation**, based on the web application provided by Xalts:  
🌐 [xaltsocnportal.web.app](https://xaltsocnportal.web.app)

---

## 🔍 Project Overview

The application under test is a standard **CRUD web app** that enables users to:
- 🔐 Sign Up and Sign In
- 🧩 Submit onboarding requests to add nodes to a common blockchain
- 🔗 Request creation of a new private blockchain
- 🚪 Sign out securely

The workflow involves form steps, validations, and blockchain-specific formats like:
- ✅ Node ID: `NodeID-001`
- ✅ Wallet Address: `0x...` (valid checksum hex)
- ✅ Public IP: `X.X.X.X` (0–255 range)

---

## 📁 Repository Structure

```bash
.
├── Part1_TestPlanDocs/
│   ├── Blockchain_Test_Plan_Document.docx
│   └── Blockchain_Test_Cases_Detailed.xlsx
│
└── Part2_AutomationProject/
    ├── testcases/
    │   ├── test_signup_login.js
    │   ├── test_onboard_existing_blockchain.js
    │   └── test_create_private_blockchain.js
