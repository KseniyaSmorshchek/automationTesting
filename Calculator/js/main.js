$(document).ready(function () {

    // VARIABLES
    var calcDisplay = $('.calculator-display');
    var calcKeys = $('.calculator-key');
    var calcButton = $('.calculator-button');
    var calcClear = $('.calculator-clear');
    var calcEqual = $('.calculator-key-equal');
    var num = $('.number');
    var operation = $('.operation');
    var needToClear = false;


    calcKeys.each(function () {
        var current = $(this).attr('value');
        $(this).text(current);
    });

    calcButton.on('click', function () {
        calcDisplay.val(calcDisplay.val() + $(this).attr('value'));
    });

    calcClear.on('click', function () {
        calcDisplay.val("");
    });

    calcEqual.on('click', function () {
        calcDisplay.val(eval(calcDisplay.val()))
        needToClear = true;
    });
    num.on('click', function () {
        if (needToClear) {
            calcDisplay.val($(this).attr('value'));
            needToClear = false;
        }
    });
    operation.on('click', function () {
        if (needToClear) {
            needToClear = false;
        }
    });
});