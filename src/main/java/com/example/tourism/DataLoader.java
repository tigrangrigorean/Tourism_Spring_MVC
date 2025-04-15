package com.example.tourism;

import com.example.tourism.models.City;
import com.example.tourism.models.Offer;
import com.example.tourism.repositories.CityRepository;
import com.example.tourism.repositories.OfferRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final CityRepository cityRepository;
    private final OfferRepository offerRepository;

    public DataLoader() {
        this.cityRepository = CityRepository.getInstance();
        this.offerRepository = OfferRepository.getInstance();
    }

    @Override
    public void run(String... args) throws Exception {
        loadCityData();
        loadOfferData();
    }

    private void loadCityData() {
//        if (cityRepository.count() == 0) {
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
    }

    private void loadOfferData() {
//            if (offerRepository.count() == 0) {

                Offer garniRomantic = new Offer();
                garniRomantic.setTitle("Ռոմանտիկ տուր դեպի Գառնի և Գեղարդ");
                garniRomantic.setDescription("Սիրահարների համար իդեալական զբոսանք. բացահայտեք Գառնիի հեթանոսական տաճարն ու Գեղարդի վանքը՝ ձեր սիրելիի հետ՝ վայելելով պատմություն և բնություն միաժամանակ:");
                garniRomantic.setImageUrl("https://yeranitravel.com/wp-content/uploads/2022/06/Garni-2-min-min.jpg");
                offerRepository.save(garniRomantic);

                Offer echmiadzinFamily = new Offer();
                echmiadzinFamily.setTitle("Ընտանեկան տուր Էջմիածին");
                echmiadzinFamily.setDescription("Իդեալական ընտանեկան օր՝ այցելելով Էջմիածնի մայր տաճարն ու մոտակա վանքերը: Երեխաները կվայելեն պատմության բացահայտումը իսկ ծնողները՝ հոգևոր հանգստությունը:");
                echmiadzinFamily.setImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/Echmiadzin-cathedral.jpg/640px-Echmiadzin-cathedral.jpg");
                offerRepository.save(echmiadzinFamily);

                Offer genocideMemorialWeekend = new Offer();
                genocideMemorialWeekend.setTitle("Պատմական շաբաթավերջ Ծիծեռնակաբերդում");
                genocideMemorialWeekend.setDescription("Սուզվեք պատմության խորքերը՝ այցելելով Հայոց ցեղասպանության հուշահամալիրը: Լավագույն վայրն է խորհելու, հիշատակելու ու կրթական փորձ ձեռք բերելու համար:");
                genocideMemorialWeekend.setImageUrl("https://d31qtdfy11mjj9.cloudfront.net/places/1574937681975858231.jpg");
                offerRepository.save(genocideMemorialWeekend);

                Offer sevanSummerFun = new Offer();
                sevanSummerFun.setTitle("Ամառային առաջարկ Սևանա լճում");
                sevanSummerFun.setDescription("Արև, լիճ և հանգիստ՝ Սևանի ափին: Այս առաջարկը ներառում է նավակներով զբոսանք, լող և ճաշ Սևանի կղզում՝ ուղեկցությամբ հիանալի տեսարանների:");
                sevanSummerFun.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQFdjQ2h60lat1cUgYLUHn0LmkNSz3iJ7tDEA&s");
                offerRepository.save(sevanSummerFun);

                Offer noravankPhotoTour = new Offer();
                noravankPhotoTour.setTitle("Նորավանք ֆոտոտուր");
                noravankPhotoTour.setDescription("Սիրում եք լուսանկարել բնություն և ճարտարապետություն? Այս տուրը ձեզ կտանի դեպի Նորավանք, որտեղ յուրաքանչյուր անկյուն հրաշք կադր է:");
                noravankPhotoTour.setImageUrl("https://campinginarmenia.com/wp-content/uploads/2020/05/Noravank-3-1-930x620-1.jpg");
                offerRepository.save(noravankPhotoTour);

                Offer khorVirapSunrise = new Offer();
                khorVirapSunrise.setTitle("Խոր Վիրապ արևածագով");
                khorVirapSunrise.setDescription("Վայելեք Խոր Վիրապի մոգական տեսարանը արևածագի ժամանակ՝ Արարատի ֆոնին: Այս արշալույսային փորձը չեք մոռանա երբեք:");
                khorVirapSunrise.setImageUrl("https://upload.wikimedia.org/wikipedia/commons/a/a3/540_Monast%C3%A8re_de_Khor_Virap_vu_de_pr%C3%A8s.JPG");
                offerRepository.save(khorVirapSunrise);

                Offer tatevAdventure = new Offer();
                tatevAdventure.setTitle("Արկածային տուր դեպի Տաթև");
                tatevAdventure.setDescription("Տաթևի լեռնագնացություն, թռիչք աշխարհի ամենաերկար ճոպանուղով և պատմական վանք այցելություն՝ ամեն ինչ մեկ արկածային օրում:");
                tatevAdventure.setImageUrl("https://upload.wikimedia.org/wikipedia/commons/c/cd/Tatev_Monastery_from_a_distance.jpg");
                offerRepository.save(tatevAdventure);

                Offer dilijanRelax = new Offer();
                dilijanRelax.setTitle("Հանգիստ Դիլիջանում");
                dilijanRelax.setDescription("Դիլիջան՝ անտառներով շրջապատված հանգստի օազիս: Այս փաթեթը նախատեսված է նրանց համար, ովքեր փնտրում են խաղաղություն, բնություն և թարմ օդ:");
                dilijanRelax.setImageUrl("https://positiveday.am/_dr/0/77017098.jpg");
                offerRepository.save(dilijanRelax);

                Offer wineLoversTour = new Offer();
                wineLoversTour.setTitle("Գինու սիրահարների փաթեթ");
                wineLoversTour.setDescription("Հայկական գինեգործարանների շրջայց՝ համտեսով, պատմությամբ և իսկական գինու փորձով: Հիանալի է ընկերների կամ զույգերի համար:");
                wineLoversTour.setImageUrl("https://mediamax.am/datas/znews/big_/2019/05/1557493248_1677354.jpg");
                offerRepository.save(wineLoversTour);

                System.out.println("Sample offer data loaded successfully.");
        }

}
