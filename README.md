# KOTLIN/Everywhere & Hacktoberfest Mataram
## WEB Challenge 

Dalam repository ini anda di challenge untuk membuat sebuah website dengan menggunakan Kotlin. Framework yang digunakan pada repository ini yakni: [ktor](http://ktor.io/).

### Cara Berkontribusi:
1. Fork Project
2. Clone ke lokal komputer anda
3. Buka project dengan IntelliJ IDEA
4. Buka direktory `src/contributors`
5. Tambahkan class baru (WAJIB KOTLIN), format penamaan: `NamaAnda`, atau `NamaAnda123`, dst.
6. Implement `Contributor` interface di class tersebut.
7. Isi kontent. Lihat contoh pada file `HayiNukman.kt` jangan lupa buat companion object `initialize` untuk memidahkan linking class dengan helper.

```kotlin
    companion object {
        fun initialize(map: MutableMap<String, Contributor>) {
            map["ha-yi"] = HayiNukman()
            map["hayinukman"] = HayiNukman()
            map["hayi"] = HayiNukman()
        }
    }
``` 
CATATAN: 

- saat mapping, gunakan unique id, bisa id github anda, atau email address.
- jangan ganti ID orang lain yang sudah ada. first come first serve. Bagi yang mengoverride nama orang lain, maka tidak akan di merge (PR ditolak).


8. Setelah class dibuat, buka file `ContributorHelper.kt`
9. Tambahkan inisialisasi class contributor anda ke sini dalam blok ini di class ContributorHelper. Contohnya:
```kotlin
    init {
        contributors.apply {
            HayiNukman.initialize(this)
            Abdullah.initialize(this)
            RobiHuzwandar.initialize(this)
        }
    }
```
10. Test.
11. Commit perubahan, kemudian lakukan pull request. 
КОТЛИН / Везде и Хактоберфест Матарам
WEB Challenge
Далам репозиторий ini anda di challenge untuk membuat веб-сайт sebuah dengan menggunakan Kotlin. Рамки Ян дигунакан пада хранилище Ини Якни: ктор.

Berkontribusi лицо:
Вилочный проект
Клон ке локал компутер анда
Buka проект dengan IntelliJ IDEA
Бука директор src / contributors
Tambahkan class baru (WAJIB KOTLIN), пенаманский формат: NamaAnda, atau NamaAnda123, dst.
Реализовать интерфейс Contributor di class tersebut.
Иси Контент. Файл компоновки папок HaiiNukman.kt jangan buat companion объект инициализирует Untuk memidahkan, связывающий класс помощника dengan.
    сопутствующий объект {
        забавная инициализация (карта: MutableMap <String, Contributor>) {
            map ["ha-yi"] = HayiNukman ()
            map ["hayinukman"] = HayiNukman ()
            map ["hayi"] = HayiNukman ()
        }
    }
Catatan:

саат маппинг, гунакан уникальный идентификатор, биса идентификатор гитхуб анда, адрес электронной почты атау.
джанган ганти ID оранг лэйн ян судах ада. первым пришел, первым обслужен. Баги ян менговерриде нама оранг лейн, мака тидак акан ди сли (пи дитолак).
Сетела класс дибуат, бука файл ContributorHelper.kt
Соучастник класса Tambahkan inisialisasi anda ke sini dalam блок ini di class ContributorHelper. Contohnya:
    init {
        contributors.apply {
            HayiNukman.initialize (это)
            Abdullah.initialize (это)
            RobiHuzwandar.initialize (это)
        }
    }
Тест.
Совершить перубахан, кемудиан лакукан тянуть запрос.
