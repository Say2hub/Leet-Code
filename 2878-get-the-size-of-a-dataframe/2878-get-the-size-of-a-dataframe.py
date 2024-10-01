import pandas as pd

def getDataframeSize(players: pd.DataFrame) -> List[int]:
    size=players.shape
    return list(size)

    