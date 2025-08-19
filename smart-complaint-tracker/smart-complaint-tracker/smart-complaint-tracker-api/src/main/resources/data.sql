INSERT INTO complaints(title, description, category, area, status, urgency, created_at, updated_at)
VALUES
('Water leakage at street 12','Pipeline burst causing water wastage','Water','Ward-A','PENDING',5,CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP()),
('Street lights not working','Dark street behind market','Electricity','Ward-B','IN_PROGRESS',4,CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP()),
('Potholes on main road','Multiple potholes causing traffic','Roads','Ward-A','PENDING',5,CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP()),
('Garbage not collected','Overflowing bins for 3 days','Sanitation','Ward-C','PENDING',3,CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP()),
('Sewage overflow','Manhole overflow near school','Sanitation','Ward-B','RESOLVED',2,CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP());
