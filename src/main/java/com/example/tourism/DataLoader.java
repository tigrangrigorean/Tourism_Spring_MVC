package com.example.tourism;

import com.example.tourism.models.City;
import com.example.tourism.repositories.CityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.*;

@Component
public class DataLoader implements CommandLineRunner {

    private final CityRepository cityRepository;

    public DataLoader(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadCityData();
    }

    private void loadCityData() {
        if (cityRepository.count() == 0) {
            City garniGeghardTour = new City();
            garniGeghardTour.setName("Գառնի և Գեղարդ");
            garniGeghardTour.setDescription("Այս տուրը կտանի ձեզ դեպի Գառնիի հեթանոսական տաճար և Գեղարդի վանք, որոնք համարվում են Հայաստանի պատմական ու ճարտարապետական շեմերը: Դիտեք Հայաստանի եզակի բնական գեղեցկությունը և պատմական հուշարձանները.");
            garniGeghardTour.setImageUrl("https://yeranitravel.com/wp-content/uploads/2022/06/Garni-2-min-min.jpg");
            cityRepository.save(garniGeghardTour);

            City echmiadzinTour = new City();
            echmiadzinTour.setName("Էջմիածին");
            echmiadzinTour.setDescription("Դիտեք Էջմիածին՝ քրիստոնեական մայրաքաղաք, որտեղ գտնվում է աշխարհի ամենահին եկեղեցիներից մեկը՝ Էջմիածնի Մայր Տաճարը: Այցելեք նաև Սուրբ Գայանե և Սուրբ Հռիփսիմե վանքերը:");
            echmiadzinTour.setImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/Echmiadzin-cathedral.jpg/640px-Echmiadzin-cathedral.jpg");
            cityRepository.save(echmiadzinTour);

            City armenianGenocideMemorialTour = new City();
            armenianGenocideMemorialTour.setName("Ծիծեռնակաբերդ");
            armenianGenocideMemorialTour.setDescription("Այցելեք Ծիծեռնակաբերդ՝ Հայաստանից մեկ այլ պատմական վայր, որտեղ գտնվում է Հայոց ցեղասպանության հուշահամալիրը: Այստեղ դուք կիմանաք այս պատմական ողբերգության մասին և կփորձեք հիշատակել զոհվածներին:");
            armenianGenocideMemorialTour.setImageUrl("https://d31qtdfy11mjj9.cloudfront.net/places/1574937681975858231.jpg");
            cityRepository.save(armenianGenocideMemorialTour);

            City lakeSevanTour = new City();
            lakeSevanTour.setName("Սևանա լիճ");
            lakeSevanTour.setDescription("Սևանա լիճը՝ Հայաստանի ամենամեծ լիճը, հայտնի է իր ապշեցուցիչ գեղեցկությամբ և հանգստյան վայրերով: Այցելեք Սևանի կղզին և վայելեք բնության գեղատեսիլ տեսարանը:");
            lakeSevanTour.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQFdjQ2h60lat1cUgYLUHn0LmkNSz3iJ7tDEA&s");
            cityRepository.save(lakeSevanTour);

            City noravankTour = new City();
            noravankTour.setName("Նորավանք");
            noravankTour.setDescription("Նորավանքը, Հայաստանի միջնադարյան ճարտարապետության գլուխգործոցներից մեկը, այցելելու համար ամենատպավորիչ վայրերից մեկն է: Շրջայցով կտեսնեք Սյունիքի անփոխարինելի գեղեցկությունը:");
            noravankTour.setImageUrl("https://campinginarmenia.com/wp-content/uploads/2020/05/Noravank-3-1-930x620-1.jpg");
            cityRepository.save(noravankTour);

            City khorVirapTour = new City();
            khorVirapTour.setName("Խոր Վիրապ");
            khorVirapTour.setDescription("Խոր Վիրապը Հայաստանի ամենահայտնի ու կարևոր վանքերից է, որտեղ գտնվում է Սուրբ Գրիգոր Լուսավորիչի բանտը: Այցելեք այս պատմական վայրն ու վայելեք տեսարան դեպի Արարատ լեռը.");
            khorVirapTour.setImageUrl("https://upload.wikimedia.org/wikipedia/commons/a/a3/540_Monast%C3%A8re_de_Khor_Virap_vu_de_pr%C3%A8s.JPG");
            cityRepository.save(khorVirapTour);

            City tatevTour = new City();
            tatevTour.setName("Տաթև");
            tatevTour.setDescription("Տաթևի վանքը, որը գտնվում է Շիրակի շրջանում, համարվում է Հայաստանի ամենագեղեցիկ և նշանակալի վանքերից մեկը: Այցելեք Տաթևի լեռնագնացությամբ՝ բացահայտելով նրա պատմությունը և ճարտարապետությունը.");
            tatevTour.setImageUrl("https://upload.wikimedia.org/wikipedia/commons/c/cd/Tatev_Monastery_from_a_distance.jpg");
            cityRepository.save(tatevTour);

            City dilijanTour = new City();
            dilijanTour.setName("Դիլիջան");
            dilijanTour.setDescription("Դիլիջան, որը կոչվում է 'Հայաստանի Շվեյցարիա', հայտնի է իր մաքուր օդով և կանաչապատ բնությամբ: Այցելեք Դիլիջանի ազգային պարկ և վայելեք հանգստություն և բնական գեղեցկություն:");
            dilijanTour.setImageUrl("https://positiveday.am/_dr/0/77017098.jpg");
            cityRepository.save(dilijanTour);

            City armeniaWineTour = new City();
            armeniaWineTour.setName("Հայկական գինեգործություն");
            armeniaWineTour.setDescription("Հայաստանը աշխարհի ամենահին գինեգործական տարածաշրջաններից մեկն է: Այս տուրը կտանի ձեզ Հայաստանի հայտնի գինեգործարաններ, որտեղ դուք կարող եք ճաշակել հայկական վայելուչ գինիներ:");
            armeniaWineTour.setImageUrl("https://mediamax.am/datas/znews/big_/2019/05/1557493248_1677354.jpg");
            cityRepository.save(armeniaWineTour);



            System.out.println("Sample tour data loaded successfully.");
        } else {
            System.out.println("Tours are already loaded in the database.");
        }

    }
}
