class Train {
    private var vagons: MutableList<Vagon> = mutableListOf()
    var start_point: String = ""
    var end_point: String = ""

    fun Create_track(cities: List<String>){
        start_point = cities.random()
        do{
            end_point = cities.random()
        } while (start_point == end_point)
    }

    fun Obtain_vagons(passengers: Int){
        var pas = passengers
        while (pas > 0){
            val seats = (5 .. 25).random()
            val vagon = Vagon(seats)
            if (pas - seats >= 0) vagon.occupied_seats = seats
            else vagon.occupied_seats = pas
            vagons.add(vagon)
            pas -= seats
        }
    }

    fun Send_train(){
        println("Поезд $start_point - $end_point ОТПРАВЛЯЕТСЯ.")
        println("Кол-во вагонов: ${vagons.size}")
        println("Списко вагонов:")
        for (vagon in vagons) println("Места: ${vagon._seats}; Из них заняты: " +
                "${vagon.occupied_seats}")
    }
}