package org.funix.animal.application;

import android.app.Application;

import org.funix.animal.R;
import org.funix.animal.model.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * khởi tạo các list animals để gán cho RecyclerView và ViewPager
 */
public class ListAnimalApplication extends Application {

    public static List<Animal> mammals;
    public static List<Animal> birds;
    public static List<Animal> seas;

    @Override
    public void onCreate() {
        super.onCreate();

        mammals = new ArrayList<>();
        birds = new ArrayList<>();
        seas = new ArrayList<>();

//        // tạo options cho bitmap các icon giảm tỉ lệ ảnh đi 4 lần để tăng tốc độ xử lý
//        BitmapFactory.Options options = new BitmapFactory.Options();
//        options.inSampleSize = 4;

//        // tạo options cho bitmap các ảnh nền giảm tỉ lệ ảnh đi 2 lần để tăng tốc độ xử lý
//        BitmapFactory.Options options2 = new BitmapFactory.Options();
//        options.inSampleSize = 2;

        // tạo id ảnh và gán cho Animals mammal
//        Bitmap icCat = BitmapFactory.decodeResource(getResources(), R.drawable.ic_cat, options);
//        Bitmap bgCat = BitmapFactory.decodeResource(getResources(), R.drawable.bg_cat, options2);
        int icCat = R.drawable.ic_cat;
        int bgCat = R.drawable.bg_cat;
        Animal cat = new Animal(icCat, bgCat, "", "Cat", getString(R.string.cat), false);

//        Bitmap icDog = BitmapFactory.decodeResource(getResources(), R.drawable.ic_dog, options);
//        Bitmap bgDog = BitmapFactory.decodeResource(getResources(), R.drawable.bg_dog, options2);
        int icDog = R.drawable.ic_dog;
        int bgDog = R.drawable.bg_dog;
        Animal dog = new Animal(icDog, bgDog, "", "Dog", getString(R.string.dog), false);

//        Bitmap icHippopotamus = BitmapFactory.decodeResource(getResources(), R.drawable.ic_hippopotamus, options);
//        Bitmap bgHippopotamus = BitmapFactory.decodeResource(getResources(), R.drawable.bg_hippopotamus, options2);
        int icHippopotamus = R.drawable.ic_hippopotamus;
        int bgHippopotamus = R.drawable.bg_hippopotamus;
        Animal hippopotamus = new Animal(icHippopotamus, bgHippopotamus, "", "Hippopotamus", getString(R.string.hippopotamus), false);

//        Bitmap icLion = BitmapFactory.decodeResource(getResources(), R.drawable.ic_lion, options);
//        Bitmap bgLion = BitmapFactory.decodeResource(getResources(), R.drawable.bg_lion, options2);
        int icLion = R.drawable.ic_lion;
        int bgLion = R.drawable.bg_lion;
        Animal lion = new Animal(icLion, bgLion, "", "Lion", getString(R.string.lion), false);

//        Bitmap icMonkey = BitmapFactory.decodeResource(getResources(), R.drawable.ic_monkey, options);
//        Bitmap bgMonkey = BitmapFactory.decodeResource(getResources(), R.drawable.bg_monkey, options2);
        int icMonkey = R.drawable.ic_monkey;
        int bgMonkey = R.drawable.bg_monkey;
        Animal monkey = new Animal(icMonkey, bgMonkey, "", "Monkey", getString(R.string.monkey), false);

//        Bitmap icRabbit = BitmapFactory.decodeResource(getResources(), R.drawable.ic_rabbit, options);
//        Bitmap bgRabbit = BitmapFactory.decodeResource(getResources(), R.drawable.bg_rabbit, options2);
        int icRabbit = R.drawable.ic_rabbit;
        int bgRabbit = R.drawable.bg_rabbit;
        Animal rabbit = new Animal(icRabbit, bgRabbit, "", "Rabbit", getString(R.string.rabbit), false);

//        Bitmap icTiger = BitmapFactory.decodeResource(getResources(), R.drawable.ic_tiger, options);
//        Bitmap bgTiger = BitmapFactory.decodeResource(getResources(), R.drawable.bg_tiger, options2);
        int icTiger = R.drawable.ic_tiger;
        int bgTiger = R.drawable.bg_tiger;
        Animal tiger = new Animal(icTiger, bgTiger, "", "Tiger", getString(R.string.tiger), false);

//        Bitmap icTurtle = BitmapFactory.decodeResource(getResources(), R.drawable.ic_turtle, options);
//        Bitmap bgTurtle = BitmapFactory.decodeResource(getResources(), R.drawable.bg_turtle, options2);
        int icTurtle = R.drawable.ic_turtle;
        int bgTurtle = R.drawable.bg_turtle;
        Animal turtle = new Animal(icTurtle, bgTurtle, "", "Turtle", getString(R.string.turtle), false);

//        Bitmap icZebra = BitmapFactory.decodeResource(getResources(), R.drawable.ic_zebra, options);
//        Bitmap bgZebra = BitmapFactory.decodeResource(getResources(), R.drawable.bg_zebra, options2);
        int icZebra = R.drawable.ic_zebra;
        int bgZebra = R.drawable.bg_zebra;
        Animal zebra = new Animal(icZebra, bgZebra, "", "Zebra", getString(R.string.zebra), false);

        // add các animal vào list loại animal tương ứng
        mammals.add(cat);
        mammals.add(dog);
        mammals.add(hippopotamus);
        mammals.add(lion);
        mammals.add(monkey);
        mammals.add(rabbit);
        mammals.add(tiger);
        mammals.add(turtle);
        mammals.add(zebra);

        // tạo id ảnh và gán cho Animals bird
//        Bitmap icEagle = BitmapFactory.decodeResource(getResources(), R.drawable.ic_eagle, options);
//        Bitmap bgEagle = BitmapFactory.decodeResource(getResources(), R.drawable.bg_eagle, options2);
        int icEagle = R.drawable.ic_eagle;
        int bgEagle = R.drawable.bg_eagle;
        Animal eagle = new Animal(icEagle, bgEagle, "", "Eagle", getString(R.string.eagle), false);

//        Bitmap icFalcon = BitmapFactory.decodeResource(getResources(), R.drawable.ic_falcon, options);
//        Bitmap bgFalcon = BitmapFactory.decodeResource(getResources(), R.drawable.bg_falcon, options2);
        int icFalcon = R.drawable.ic_falcon;
        int bgFalcon = R.drawable.bg_falcon;
        Animal falcon = new Animal(icFalcon, bgFalcon, "", "Falcon", getString(R.string.falcon), false);

//        Bitmap icHawk = BitmapFactory.decodeResource(getResources(), R.drawable.ic_hawk, options);
//        Bitmap bgHawk = BitmapFactory.decodeResource(getResources(), R.drawable.bg_hawk, options2);
        int icHawk = R.drawable.ic_hawk;
        int bgHawk = R.drawable.bg_hawk;
        Animal hawk = new Animal(icHawk, bgHawk, "", "Hawk", getString(R.string.hawk), false);

//        Bitmap icParrot = BitmapFactory.decodeResource(getResources(), R.drawable.ic_parrot, options);
//        Bitmap bgParrot = BitmapFactory.decodeResource(getResources(), R.drawable.bg_parrot, options2);
        int icParrot = R.drawable.ic_parrot;
        int bgParrot = R.drawable.bg_parrot;
        Animal parrot = new Animal(icParrot, bgParrot, "", "Parrot", getString(R.string.parrot), false);

//        Bitmap icPeacock = BitmapFactory.decodeResource(getResources(), R.drawable.ic_peacock, options);
//        Bitmap bgPeacock = BitmapFactory.decodeResource(getResources(), R.drawable.bg_peacock, options2);
        int icPeacock = R.drawable.ic_peacock;
        int bgPeacock = R.drawable.bg_peacock;
        Animal peacock = new Animal(icPeacock, bgPeacock, "", "Peacock", getString(R.string.peacock), false);

//        Bitmap icPenguin = BitmapFactory.decodeResource(getResources(), R.drawable.ic_penguin, options);
//        Bitmap bgPenguin = BitmapFactory.decodeResource(getResources(), R.drawable.bg_penguin, options2);
        int icPenguin = R.drawable.ic_penguin;
        int bgPenguin = R.drawable.bg_penguin;
        Animal penguin = new Animal(icPenguin, bgPenguin, "", "Penguin", getString(R.string.penguin), false);

//        Bitmap icRaven = BitmapFactory.decodeResource(getResources(), R.drawable.ic_raven, options);
//        Bitmap bgRaven = BitmapFactory.decodeResource(getResources(), R.drawable.bg_raven, options2);
        int icRaven = R.drawable.ic_raven;
        int bgRaven = R.drawable.bg_raven;
        Animal raven = new Animal(icRaven, bgRaven, "", "Raven", getString(R.string.raven), false);

//        Bitmap icSparrow = BitmapFactory.decodeResource(getResources(), R.drawable.ic_sparrow, options);
//        Bitmap bgSparrow = BitmapFactory.decodeResource(getResources(), R.drawable.bg_sparrow, options2);
        int icSparrow = R.drawable.ic_sparrow;
        int bgSparrow = R.drawable.bg_sparrow;
        Animal sparrow = new Animal(icSparrow, bgSparrow, "", "Sparrow", getString(R.string.sparrow), false);

//        Bitmap icWoodpecker = BitmapFactory.decodeResource(getResources(), R.drawable.ic_woodpecker, options);
//        Bitmap bgWoodpecker = BitmapFactory.decodeResource(getResources(), R.drawable.bg_woodpecker, options2);
        int icWoodpecker = R.drawable.ic_woodpecker;
        int bgWoodpecker = R.drawable.bg_woodpecker;
        Animal woodpecker = new Animal(icWoodpecker, bgWoodpecker, "", "Woodpecker", getString(R.string.woodpecker), false);

        birds.add(eagle);
        birds.add(falcon);
        birds.add(hawk);
        birds.add(parrot);
        birds.add(peacock);
        birds.add(penguin);
        birds.add(raven);
        birds.add(sparrow);
        birds.add(woodpecker);

        // tạo id ảnh và gán cho Animals sea
//        Bitmap icCrab = BitmapFactory.decodeResource(getResources(), R.drawable.ic_crab, options);
//        Bitmap bgCrab = BitmapFactory.decodeResource(getResources(), R.drawable.bg_crab, options2);
        int icCrab = R.drawable.ic_crab;
        int bgCrab = R.drawable.bg_crab;
        Animal crab = new Animal(icCrab, bgCrab, "", "Crab", getString(R.string.crab), false);

//        Bitmap icDolphin = BitmapFactory.decodeResource(getResources(), R.drawable.ic_dolphin, options);
//        Bitmap bgDolphin = BitmapFactory.decodeResource(getResources(), R.drawable.bg_dolphin, options2);
        int icDolphin = R.drawable.ic_dolphin;
        int bgDolphin = R.drawable.bg_dolphin;
        Animal dolphin = new Animal(icDolphin, bgDolphin, "", "Dolphin", getString(R.string.dolphin), false);

//        Bitmap icJellyfish = BitmapFactory.decodeResource(getResources(), R.drawable.ic_jellyfish, options);
//        Bitmap bgJellyfish = BitmapFactory.decodeResource(getResources(), R.drawable.bg_jellyfish, options2);
        int icJellyfish = R.drawable.ic_jellyfish;
        int bgJellyfish = R.drawable.bg_jellyfish;
        Animal jellyfish = new Animal(icJellyfish, bgJellyfish, "", "Jellyfish", getString(R.string.jellyfish), false);

//        Bitmap icOctopus = BitmapFactory.decodeResource(getResources(), R.drawable.ic_octopus, options);
//        Bitmap bgOctopus = BitmapFactory.decodeResource(getResources(), R.drawable.bg_octopus, options2);
        int icOctopus = R.drawable.ic_octopus;
        int bgOctopus = R.drawable.bg_octopus;
        Animal octopus = new Animal(icOctopus, bgOctopus, "", "Octopus", getString(R.string.octopus), false);

//        Bitmap icRedSnapper = BitmapFactory.decodeResource(getResources(), R.drawable.ic_red_snapper, options);
//        Bitmap bgRedSnapper = BitmapFactory.decodeResource(getResources(), R.drawable.bg_red_snapper, options2);
        int icRedSnapper = R.drawable.ic_red_snapper;
        int bgRedSnapper = R.drawable.bg_red_snapper;
        Animal snapper = new Animal(icRedSnapper, bgRedSnapper, "", "Snapper", getString(R.string.snapper), false);

//        Bitmap icShark = BitmapFactory.decodeResource(getResources(), R.drawable.ic_shark, options);
//        Bitmap bgShark = BitmapFactory.decodeResource(getResources(), R.drawable.bg_shark, options2);
        int icShark = R.drawable.ic_shark;
        int bgShark = R.drawable.bg_shark;
        Animal shark = new Animal(icShark, bgShark, "", "Shark", getString(R.string.shark), false);

//        Bitmap icSquid = BitmapFactory.decodeResource(getResources(), R.drawable.ic_squid, options);
//        Bitmap bgSquid = BitmapFactory.decodeResource(getResources(), R.drawable.bg_squid, options2);
        int icSquid = R.drawable.ic_squid;
        int bgSquid = R.drawable.bg_squid;
        Animal squid = new Animal(icSquid, bgSquid, "", "Squid", getString(R.string.squid), false);

//        Bitmap icSwordfish = BitmapFactory.decodeResource(getResources(), R.drawable.ic_swordfish, options);
//        Bitmap bgSwordfish = BitmapFactory.decodeResource(getResources(), R.drawable.bg_swordfish, options2);
        int icSwordfish = R.drawable.ic_swordfish;
        int bgSwordfish = R.drawable.bg_swordfish;
        Animal swordfish = new Animal(icSwordfish, bgSwordfish, "", "Swordfish", getString(R.string.swordfish), false);

//        Bitmap icWhale = BitmapFactory.decodeResource(getResources(), R.drawable.ic_whale, options);
//        Bitmap bgWhale = BitmapFactory.decodeResource(getResources(), R.drawable.bg_whale, options2);
        int icWhale = R.drawable.ic_whale;
        int bgWhale = R.drawable.bg_whale;
        Animal whale = new Animal(icWhale, bgWhale, "", "Whale", getString(R.string.whale), false);

        seas.add(crab);
        seas.add(dolphin);
        seas.add(jellyfish);
        seas.add(octopus);
        seas.add(snapper);
        seas.add(shark);
        seas.add(squid);
        seas.add(swordfish);
        seas.add(whale);
    }
}
