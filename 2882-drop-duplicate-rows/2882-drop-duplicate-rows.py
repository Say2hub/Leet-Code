import pandas as pd

def dropDuplicateEmails(customers: pd.DataFrame) -> pd.DataFrame:
    df=pd.DataFrame(customers)
    df_clean = df.drop_duplicates(subset=['email'])
    return df_clean
    