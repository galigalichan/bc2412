-- 1517. Find Users With Valid E-Mails

-- Table: Users
-- +---------------+---------+
-- | Column Name   | Type    |
-- +---------------+---------+
-- | user_id       | int     |
-- | name          | varchar |
-- | mail          | varchar |
-- +---------------+---------+
-- user_id is the primary key (column with unique values) for this table.
-- This table contains information of the users signed up in a website. Some e-mails are invalid.
--  

-- Write a solution to find the users who have valid emails.

-- A valid e-mail has a prefix name and a domain where:

-- The prefix name is a string that may contain letters (upper or lower case), digits, underscore '_', period '.', and/or dash '-'. The prefix name must start with a letter.
-- The domain is '@leetcode.com'.
-- Return the result table in any order.

-- The result format is in the following example.

--  

-- Example 1:

-- Input: 
-- Users table:
-- +---------+-----------+-------------------------+
-- | user_id | name      | mail                    |
-- +---------+-----------+-------------------------+
-- | 1       | Winston   | winston@leetcode.com    |
-- | 2       | Jonathan  | jonathanisgreat         |
-- | 3       | Annabelle | bella-@leetcode.com     |
-- | 4       | Sally     | sally.come@leetcode.com |
-- | 5       | Marwan    | quarz#2020@leetcode.com |
-- | 6       | David     | david69@gmail.com       |
-- | 7       | Shapiro   | .shapo@leetcode.com     |
-- +---------+-----------+-------------------------+
-- Output: 
-- +---------+-----------+-------------------------+
-- | user_id | name      | mail                    |
-- +---------+-----------+-------------------------+
-- | 1       | Winston   | winston@leetcode.com    |
-- | 3       | Annabelle | bella-@leetcode.com     |
-- | 4       | Sally     | sally.come@leetcode.com |
-- +---------+-----------+-------------------------+
-- Explanation: 
-- The mail of user 2 does not have a domain.
-- The mail of user 5 has the # sign which is not allowed.
-- The mail of user 6 does not have the leetcode domain.
-- The mail of user 7 starts with a period.

select *
from Users
where mail regexp '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode(\\?com)?\\.com$';

-- ^: Anchor the regex pattern to match from the start of the string.
-- [A-Za-z]: Match any single uppercase or lowercase letter. The email prefix name must start with a letter.
-- [A-Za-z0-9_.-]*: Match any number of characters following the first letter in the email prefix name. It includes letters (upper or lower case), digits, underscore '_', period '.', and/or dash '-'.
-- @: Match the literal '@' character, which separates the prefix name and the domain.
-- leetcode: Match the literal 'leetcode', which is part of the email domain.
-- (?com)?: Make the sequence ?com optional in the email domain. Allows the pattern to match both '@leetcode.com' and '@leetcode?com'.
-- . : Match the literal '.' character, which separates the 'leetcode' part from the 'com' part of the domain.
-- com: Match the literal 'com' at the end of the email domain.
-- $: Anchor the regex pattern to match until the end of the string.