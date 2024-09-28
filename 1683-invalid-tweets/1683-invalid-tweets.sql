# Write your MySQL query statement below

Select tweet_id FROM Tweets
where tweet_id IN (
    Select tweet_id from Tweets 
    WHERE Length(content) > 15
);