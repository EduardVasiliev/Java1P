/*Fluxuri
Exita un flux pentru operatia de iesire, al flux pentru operatia de intrare.
Raportat la aplicatia curenta:
1. Flux iesire
2. Flux intrare

Dupa ce date putem transmite in flux:
1. Low Level
2. High Level
Informatia circula sub forma de Bytes. Fluxul low level opereaza doar cu Bytes. 
Fluxul high level transforma informatia din forma originala intr-un flux de Bytes. 
(Face conversia in date binare). Flux high level fara low level nu se poate. 

Dupa tipul de date transformat.
1. Fluxuri care transfera Byte-wise.
2. Fluxuri care transdera Char-wise. 

Clase de fluxuri:
1. InputStream si OutputStream <- definesc fluxuri BYTE-wise,

    <FileInputStream>           <FileOutputStream>      Fluxuri Low level

    <ObjectInputSteam>          <ObjectOutputSteam>
    <BufferInputSteam>          <BufferOutputStream>    Fluxuri High Level
    <PrintStream>                <PrintWriter>   <- singurele care nu arunca exceptii

  mosteneste InputStream       mosteneste OutputStream

Exceptii: IOException, FileNotFoundException.


2. Reader si Writer            <- definesc fluxuri CHAR-wise

    <FileReader>        <FileWriter>
    <BufferedReader>      <BufferedWriter>
    <InputSteamReader>  <OutputSreamWriter>

  mosteneste Reader    mosteneste Writer

Toate 4 difinesc fluxuri abstracte. 



*/