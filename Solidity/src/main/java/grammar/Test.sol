// SPDX-License-Identifier: MIT
pragma solidity >=0.8.7;

contract Test {

    // Variabile che dovrebbe suggerire l'ottimizzazione
    address public owner = msg.sender;

    // Variabile ottimizzata con immutable
    address public immutable immutableOwner = msg.sender;

    // Funzione semplice per testare altre ottimizzazioni
    function additionOptimization() public pure returns (uint) {
        uint number = 5;
        number += 10;  // Ottimizzazione: Sostituire con `number = number + 10`
        return number;
    }

    // Funzione con divisione per potenza di 2
    function divisionOptimization(uint x) public pure returns (uint) {
        return x / 8;  // Ottimizzazione: Sostituire con `x >> 3`
    }

    // Funzione che accede a .length di un array ripetutamente
    function arrayLengthOptimization(uint[] memory data) public pure returns (uint) {
        uint sum = 0;
        for (uint i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }

    // Funzione che utilizza `require` con messaggio di errore
    function customErrorOptimization(uint x) public pure {
        require(x > 0, "Value must be greater than 0");  // Ottimizzazione: usare errore personalizzato
    }

    // Funzione con confronto ottimizzabile
    function comparisonOptimization(int number) public pure returns (bool) {
        return number != 0;  // Ottimizzazione: Sostituire con `number > 0` se il numero è sempre positivo
    }
}
