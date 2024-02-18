use pedrys
go

create schema budget
    go

CREATE TABLE budget.BudgetEntries (
                                      ID int IDENTITY PRIMARY KEY,
                                      EntryDate datetime NOT NULL DEFAULT getdate(),
                                      EntryName nvarchar(255) NOT NULL,
                                      Amount money NOT NULL
)

select * from budget.BudgetEntries

    insert into budget.BudgetEntries (EntryName, Amount) values ('Kino', -60)
insert into budget.BudgetEntries (EntryName, Amount) values ('Wypłata', 4000)

select sum(Amount) from budget.BudgetEntries;