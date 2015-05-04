package dk.dm844.bsg

class ChuckNorrisTagLib {

    static defaultEncodeAs = [taglib: 'none']
    static namespace = "cn"

    ChuckNorrisQuoteService chuckNorrisQuoteService

    def randomChuckNorrisJoke = {
        out << '<span class="chuck-norris-joke">'
        out << chuckNorrisQuoteService.chuckNorrisQuote.encodeAsHTML()
        out << '</span>'
    }
}

