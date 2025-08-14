$(document).ready(() => {
const config = {
    inputStream: {
        name: "Live",
        type: "LiveStream",
        target: document.querySelector('#interactive'),
        constraints: {
            width: 640,
            height: 480,
            facingMode: "environment"
        }
    },
    decoder: {
        readers: ['ean_reader', 'code_128_reader']
    }
};

Quagga.init(config, err => {
    if (err) {
        console.log(err);
        $('#code').text('Fehler beim Initialisieren ' + err);
        return;
    }
    Quagga.start();
});

Quagga.onDetected(data => {
    $('#code').val(data.codeResult.code);
})
})