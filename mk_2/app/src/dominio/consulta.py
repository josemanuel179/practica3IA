class Consulta():
    
    def __init__(self, court, round_imp, best_of, player0, player1):
        self._court = court
        self._round_imp = round_imp
        self._best_of = best_of
        self._player0 = player0
        self._player1 = player1
    
    def __str__(self):
        return f"{self._court}, {self._round_imp}, {self._best_of}, {self._player0}, {self._player1}"
    
    # Ver como hacer que esto funcione
    @property
    def court(self):
        return self._court

    @court.setter
    def court(self, court):
        self._court = court


