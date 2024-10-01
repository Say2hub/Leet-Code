import pandas as pd

def pivotTable(weather: pd.DataFrame) -> pd.DataFrame:
    pivot_df=weather.pivot_table(
        index='month',
        columns='city',
        values='temperature',
        #aggfunc='values',
        fill_value=0
    )
    return pivot_df

    