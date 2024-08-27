DECLARE
    CURSOR account_cursor IS
        SELECT account_id, balance
        FROM accounts;

    v_account_id accounts.account_id%TYPE;
    v_balance accounts.balance%TYPE;
    v_fee CONSTANT NUMBER := 50; -- Example annual maintenance fee
BEGIN
    OPEN account_cursor;
    LOOP
        FETCH account_cursor INTO v_account_id, v_balance;
        EXIT WHEN account_cursor%NOTFOUND;

        UPDATE accounts
        SET balance = balance - v_fee
        WHERE account_id = v_account_id;
    END LOOP;
    CLOSE account_cursor;

    COMMIT;
END;
/
