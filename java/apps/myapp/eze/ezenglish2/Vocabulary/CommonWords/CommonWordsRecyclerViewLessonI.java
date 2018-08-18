package apps.myapp.eze.ezenglish2.Vocabulary.CommonWords;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import apps.myapp.eze.ezenglish2.R;

import java.util.ArrayList;

public class CommonWordsRecyclerViewLessonI extends AppCompatActivity {

    ArrayList<ImageVO> ImageList;
    RecyclerView ImageRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(apps.myapp.eze.ezenglish2.R.layout.activity_common_words_recycler_view_lesson_i);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ConstructRecycler();
    }

    private void fillContent(){
        //Expressions in A
        ImageList.add(new ImageVO(getString(apps.myapp.eze.ezenglish2.R.string.a_case),getString(apps.myapp.eze.ezenglish2.R.string.a_case_of_content),
                apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.a_case_of_mistaken_identity));
        ImageList.add(new ImageVO(getString(apps.myapp.eze.ezenglish2.R.string.a_change_of_pace),getString(apps.myapp.eze.ezenglish2.R.string.a_change_of_pace_content), apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.a_change_of_pace));
        ImageList.add(new ImageVO(getString(apps.myapp.eze.ezenglish2.R.string.a_chance_of_scenery),getString(apps.myapp.eze.ezenglish2.R.string.a_chance_of_scenery_content), apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.a_change_of_scenery));
        ImageList.add(new ImageVO(getString(apps.myapp.eze.ezenglish2.R.string.a_chip_off_the_old_block),getString(apps.myapp.eze.ezenglish2.R.string.a_chip_off_the_old_block_content), apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.a_chip_off_the_old_block));
        ImageList.add(new ImageVO(getString(apps.myapp.eze.ezenglish2.R.string.a_chip_on_your_shoulder),getString(apps.myapp.eze.ezenglish2.R.string.a_chip_on_your_shoulder_content),
                 apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.a_chip_on_your_shoulder));
        ImageList.add(new ImageVO(getString(apps.myapp.eze.ezenglish2.R.string.a_copycat),getString(apps.myapp.eze.ezenglish2.R.string.a_copycat_content), apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.a_copy_cat));
        ImageList.add(new ImageVO(getString(apps.myapp.eze.ezenglish2.R.string.a_crying_shame),getString(apps.myapp.eze.ezenglish2.R.string.a_crying_shame_content), apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.a_crying_shame));
        ImageList.add(new ImageVO("A Cut Above","Something which is better than the others is a cut above.\n" +
                "\n" +
                "Example: \"I love this restaurant. It is a cut above.\" ", apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.a_cut_above));
        ImageList.add(new ImageVO("All Night Long","All night long means during the whole night.\n" +
                "\n" +
                "Example: \"The baby was up crying all night long.\"\n" +
                "\n" +
                "Example: \"All night long people kept walking into my room and waking me up.\"", apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.all_night_long));
        ImageList.add(new ImageVO("All Over","All over means that it is finished.\n" +
                "\n It means too: everywhere; in or on every part of;throughout" +
                "\n" +
                "\n" +
                "Example: \"Is the game still on?\" Reply: \"No, it's all over.\" ", apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.all_over));
        ImageList.add(new ImageVO("All Over Again","All over again means that thing happened before and now it is happening again, in the same way.\n" +
                "\n" +
                "Example: \"Do you remember Berlin? This is the same thing all over again.\"\n" +
                "\n" +
                "\"They attacked us before, now it is happening all over again.\"\n" +
                "\n" +
                "\"I had a terrible time at my last job and now it is happening all over again.\" ", apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.all_over_again));
        ImageList.add(new ImageVO("All Set","All set means ready, prepared and in place for that thing to happen.\n" +
                "\n" +
                "Example: \"Are you all set for the big game?\" ", apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.all_set_image));
        ImageList.add(new ImageVO("All Skin And Bones","All skin and bones means that person is so skinny (thin) that she is unhealthy.\n" +
                "\n" +
                "Example: \"Have you seen Karen? She is all skin and bones.\"\n" +
                "\n" +
                "\"That poor dog is all skin and bones.\" ", apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.all_skin_and_bones));
        ImageList.add(new ImageVO("All Talk And No Action","All talk and no action describes a person who says he will do things but does not do them.\n" +
                "\n" +
                "Example: \"John promised he would be here.\" Reply: \"He is all talk and no action.\" ", apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.all_talk_no_action));
        ImageList.add(new ImageVO("All The Rage","If everyone wants to do or have that thing, it is all the rage.\n" +
                "The thing that is very, very popular is all the rage.\n" +
                "\n" +
                "Example: \"Do you like this scarf? It is all the rage.\"\n" +
                "\n" +
                "\"Do you remember when cabbage patch dolls were all the rage.\" ", apps.myapp.eze.ezenglish2.R.drawable.a, apps.myapp.eze.ezenglish2.R.drawable.all_the_rage));

        // Expressions in B
        ImageList.add(new ImageVO("Back And Forth","Back and forth describes the movement which goes in one direction, then turns and goes back in that direction from which it came.\n" +
                "\n" +
                "Example: \"What fun could it be playing tennis? They just hit the ball back and forth all day.\"\n" +
                "\n" +
                "Back and forth also describes a continual change in direction of some plan or action.\n" +
                "\n" +
                "Example: \"Will you start college this fall?\" Reply: \"I don't know. I keep going back and forth on it.\"\n" +
                "\n" +
                "Going back and forth on a decision means that you have not yet decided.\n" +
                "\n" +
                "Example: \"Is Jane coming or not?\" Reply: \"We still don't know. She keeps going back and forth.", apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.back_and_forth));
        ImageList.add(new ImageVO("Back Down From","To back down is to quit one's plans to fight.\n" +
                "\n" +
                "Example: \"If I were you, I would back down. It is not worth fighting about.\"\n" +
                "\n" +
                "If you were planning to compete, but now you have decided not to, you backed down.\n" +
                "\n" +
                "Example: \"Maybe you don't know me, but I would never back down from a challenge.\" ", apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.back_down_from));
        ImageList.add(new ImageVO("Back In Circulation","A person who is communication after not being seen for a while is \"back in circulation\".\n" +
                "\n" +
                "Example: \"John, where have you been? It is good to see you back in circulation.\"\n" +
                "\n" +
                "Example: \"Look, it's Bob! He's back in circulation.\"\n" +
                "\n" +
                "\"Circulation\" is moving around, and people who are moving around again are \"back in circulation\".\n" +
                "\n" +
                "Example: \"After my operation, it took me a long time to get back in circulation.\"\n" +
                "\n" +
                "Example: \"How does it feel to be back in circulation?\" ", apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.back_in_circulation));
        ImageList.add(new ImageVO("Back Me Up","You back someone up when you add your strength to support that person.\n" +
                "\n" +
                "A person telling a lie might ask another to \"back him up\"\n" +
                "\n" +
                "Example: \"I told my mom we were at the baseball game last night. Back my up.\" ", apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.back_me_up));
        ImageList.add(new ImageVO("Back off","To back off is to move back to give one space.\n" +
                "\n" +
                "Example: \"I guess I made her angry. She told me to back off and leave her alone.\"\n" +
                "\n" +
                "If we get too close to person, or try to talk about something which is too private, he may tell us to back off.\n" +
                "\n" +
                "Example: \"I told you I don't want to talk about it. Back off!\" (agressive) ", apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.back_off));
        ImageList.add(new ImageVO("Back Order Them","To back order is to order some product which is not available right away.\n" +
                "\n" +
                "Example: \"We don't have them in your size today. But I would be glad to back order them for you.\"\n" +
                "\n" +
                "One must wait for the arrival of that thing which is back ordered because it will have to be shipped from another place.\n" +
                "\n" +
                "Example: \"Those are on back order. Do you want me to call you when they arrive?\" ", apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.back_order));
        ImageList.add(new ImageVO("Back The Wrong Horse","You back the wrong horse when you cheer for the one who will be the loser.\n" +
                "\n" +
                "Example: \"Who did you bet on in the superbowl?\" Reply: \"Arizona.\"" +
                " Answer: \"Ouch. You backed the wrong horse.\" ", apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.back_the_wrong_horse));
        ImageList.add(new ImageVO("Back To Back","Back to back means the one thing happens then the other thing happens right way.\n" +
                "\n" +
                "Example: \"We have had back to back losses and we need to play better.\" ", apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.back_to_back));
        ImageList.add(new ImageVO("Back To Square One","Square one is the point where you start from, so back to square one is starting again from the very beginning.\n" +
                "\n" +
                "Example: \"After all that work, they decided not to hire me.\" Reply: \"Back to square one.\"\n" +
                "\n" +
                "There may have been a failure or a loss or some other reason to start again, when you have to go back to the beginning and \"start from square one.\"\n" +
                "\n" +
                "Example: \"What will you do if you lose everything you have.\" Reply: \"Go back to square one, and start again.\" ", apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.back_to_square_one));
        ImageList.add(new ImageVO("Bad Blood Between People","Bad blood between people is a bad feeling about each other that has a long history.\n" +
                "\n" +
                "Example: \"My brother and I haven't spoken since childhood. There is a lot of bad blood between us.\" ", apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.bad_blood_between));
        ImageList.add(new ImageVO("Bad Mouthing You","To \"bad mouth\" someone when is to say bad things about that person.\n" +
                "\n" +
                "Example: \"You are one of my best friends. I would never bad mouth you.\"\n" +
                "\n" +
                "You bad mouth a person when you talk about that person in a bad way.\n" +
                "\n" +
                "Example: \"Has she been bad mouthing me again?\"\n" +
                "\n" +
                "To talk badly about some thing is to bad mouth it.\n" +
                "\n" +
                "Example: \"I heard you have been bad mouthing me.\"\n" +
                "\n" +
                "Example: \"Don't bad mouth our school.\" ", apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.bad_mouthing_someone));
        ImageList.add(new ImageVO("Bag Of Tricks","When a person has many special ways to get things done, " +
                "he has a bag of tricks.", apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.bag_of_tricks));
        ImageList.add(new ImageVO("Bail Me Out","To help a person get out of a bad situation is to bail him out.\n" +
                "\n" +
                "Example: \"He got thrown in jail for drunk driving, but his father bailed him out.\"\n" +
                "\n" +
                "It takes time, money and effort to bail a person out of a difficult situation.\n" +
                "\n" +
                "Example: \"If you get stuck, call me. I will bail you out.\" ", apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.bail_me_out));
        ImageList.add(new ImageVO("Bait And Switch","\"The bait and switch\" is a trick where you pretend to give one thing but then you give something different.\n" +
                "\n" +
                "Example: \"I thought I was buying a new watch.\" Reply: \"It looks like they gave you the bait and switch.\"\n" +
                "\n" +
                "When you say you \"got the bait and switch\", you mean that the thing they gave you was different from the thing they promised to give you.\n" +
                "\n" +
                "Example: \"This does not look like the necklace I paid for.\" Reply: \"Do you think they gave you the bait and switch?\"\n" +
                "\n" +
                "\"The bait and switch\" is a way that people are cheated from their money where the person shows them one thing (\"the bait\") but changes it (\"and switch\") to give them something else.\n" +
                "\n" +
                "Example: \"Hey this is not the shirt I paid for!\" Reply: \"Be careful with street vendors here. They like to give " +
                "you the bait and switch.\" ", apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.bait_and_switch));
        ImageList.add(new ImageVO("Bank On Something","Banking on it is needing it to happen and expecting that it will happen.\n" +
                "\n" +
                "Example: \"I will be there. You can bank on it.\"\n" +
                "\n" +
                "Example: \"Do you think your guy will win?\" Reply: \"You can bank on it.\"", apps.myapp.eze.ezenglish2.R.drawable.b, apps.myapp.eze.ezenglish2.R.drawable.bank_on_it));

        //Expressions in C
        ImageList.add(new ImageVO("Call It A Day","\n" +
                "You call it a day when you decide that the work day is finished.\n" +
                "\n" +
                "Example: \"It's time to go home. Let's call it a day.\" ", apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.call_it_a_day));
        ImageList.add(new ImageVO("Call It A Night","You \"call it a night\" when it is nighttime and you decide to go home or go to bed.\n" +
                "\n" +
                "Example: \"You guys are going to another bar? Not me. I'm calling it a night.\" ", apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.call_it_a_night));
        ImageList.add(new ImageVO("Call It Off","\n" +
                "You call something off when you decide to cancel it.\n" +
                "\n" +
                "Example: \"How did your party go?\" Reply: \"Oh. We had to call it off.\" ", apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.call_it_off));
        ImageList.add(new ImageVO("Calling People Names","\"Calling people names\" is using rude words to address people.\n" +
                "\n" +
                "Example: \"You are a jerk!\" Reply: \"You don't have to call me names.\"\n" +
                "\n" +
                "Example: \"You shouldn't call people names.\"\n" +
                "\n" +
                "Example: \"I would never date someone who called me names.\"\n" +
                "\n" +
                "You call a person names when you use rude words to insult that person.\n" +
                "\n" +
                "Example: \"What a fight they were having. You should have heard the names he called her.\"\n" +
                "\n" +
                "Example: \"Just because you're angry, you don't have to call me names.\"\n" +
                "\n" +
                "When you use impolite words to address people, you are \"calling people names.\"\n" +
                "\n" +
                "Example: \"Mom! She is calling me names!\"\n" +
                "\n" +
                "Example: \"When we were children, we used to call each other names.\" ", apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.calling_people_names));
        ImageList.add(new ImageVO("Can Take It To The Bank","\"You say \"you can take it to the bank\" when you are certain that it will happen.\n" +
                "\n" +
                "When they are sure that it will happen and they want to make it clear how sure they are, " +
                "people say \"you can take that to the bank\". ", apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.can_take_it_to_the_bank));
        ImageList.add(new ImageVO("Can You Imagine?","A person says \"Can you imagine?\" to show surprise at what has happened.\n" +
                "\n" +
                "Example: \"This car only cost me $500. Can you imagine?\" ", apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.can_you_imagine));
        ImageList.add(new ImageVO("Can't Carry A Tune","A person who is completely unable to sing \"can't carry a tune.\"\n" +
                "\n" +
                "Example: \"Sing with us!\" Reply: \"Sorry. You wouldn't want me to. I can't carry a tune.\"\n" +
                "\n" +
                "\"My dad refuses to sing with us.\" Reply: \"Why?\" Answer: \"He says he can't carry a tune.\"\n" +
                "\n" +
                "\"Before taking singing lessons, she couldn't carry a tune.\"\n" +
                "\n" +
                "\"He's fun to sing with, but to be honest, he can't carry a tune.\" ", apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.can_t_carry_a_tune));
        ImageList.add(new ImageVO("Can't Cut The Mustard","When you are not able to perform at the required level, you can't cut the mustard.\n" +
                "\n" +
                "Example: \"Did you hear that Williams got fired?\" Reply: \"Yes. He couldn't cut the mustard.\"\n" +
                "\n" +
                "It is as if cutting \"the mustard\" were some test that you had to pass in order to belong. If you can't cut the mustard, you are not allowed to participate.\n" +
                "\n" +
                "Example: \"Bob dropped out of medical school.\" Reply: \"Why?\" Answer: \"He just couldn't cut the mustard.\"\n" +
                "\n" +
                "If you don't work hard enough, or if you just aren't good enough, you can't cut the mustard.\n" +
                "\n" +
                "Example: \"So, do you think you will be able to cut the mustard?\" ", apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.can_t_cut_the_mustard));
        ImageList.add(new ImageVO("Can't Do Anything With Someone Or Something","When you cannot help a person or thing to become better or more useful, you can't do anything with him.\n" +
                "\n" +
                "Example: \"Your teacher is frustrated. She says she can't do anything with you.\"\n" +
                "\n" +
                "Example: \"Since breaking this leg, I can't do anything with it.\"\n" +
                "\n" +
                "Example: \"Is there something wrong with this pen? I can't do anything with it.\" ", apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.can_t_do_anything));
        ImageList.add(new ImageVO("Can't Hold A Candle To Someone","You \"can't hold a candle to\" someone when that person is much better than you.\n" +
                "\n" +
                "Example: \"You are a good tennis player. But you can't hold a candle to my sister.\"\n" +
                "\n" +
                "When the other person (or thing) is much better, the one \"can't hold a candle to\" the other.\n" +
                "\n" +
                "Example: \"She's a good cook. But she can't hold a candle to my mother.\" ", apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.can_t_hold_a_candle));
        ImageList.add(new ImageVO("Cannot Help Doing Something","You have to do the thing that you \"cannot help doing\".\n" +
                "\n" +
                "Example: \"When she said that, I couldn't help laughing.\"\n" +
                "\n" +
                "You do not have the choice of not doing the thing you \"cannot help doing\".\n" +
                "\n" +
                "Example: \"When I eat seafood, I cannot help throwing up.\" ", apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.cannot_help_doing_something));
        ImageList.add(new ImageVO("Carry A Secret To One's Grave","A secret that you carry to your grave is something you never tell anyone during your entire lifetime.\n" +
                "\n" +
                "Example: \"Please, you must not tell anyone what happened.\" Reply: \"I will carry your secret to my grave.\"\n" +
                "\n" +
                "Something you know but do not tell others is \"a secret\", and \"a secret you carry to your grave\" is a secret you do not tell anyone during your entire life.\n" +
                "\n" +
                "Example: \"During his entire life, he never told anyone where he buried the money. He carried the secret to his grave.\"\n" +
                "\n" +
                "When you don't tell even one person what happened, you \"carry the secret to your grave\".\n" +
                "\n" +
                "Example: \"She and her sister were abused when they were children, but they never told anyone. They carried the secret to their grave.\"\n" +
                "\n" +
                "If you do not tell anyone that secret during your entire life, you \"carry it to your grave\". ", apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.carry_a_secret_to_grave));
        ImageList.add(new ImageVO("Carry On Without Someone Or Something","If you keep doing that thing even after that person is gone, you carry on without her.\n" +
                "\n" +
                "Example: \"If anything ever happens to me, I want you to carry on without me.\"\n" +
                "\n" +
                "Example: \"It is true that our best player has broken his leg, but we will carry on without him.\"\n" +
                "\n" +
                "To carry on without someone is to continue doing that thing after that person is gone.\n" +
                "\n" +
                "Example: \"I'm done playing for today. Carry on without me.\"\n" +
                "\n" +
                "Example: \"Really, I need to go. You two carry on without me.\"\n" +
                "\n" +
                "Example: \"Her husband died, and she has carried on without him.\"\n" +
                "\n" +
                "If you lose some thing but continue doing what you were doing, you carry on without that thing.\n" +
                "\n" +
                "Example: \"Her shoe fell off in the middle of the race, but she carried on without it.\" ", apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.carry_on));
        ImageList.add(new ImageVO("Carrying It A Bit Too Far","\"Carrying it a bit too far\" is doing too much of some thing and not stopping when you should stop.\n" +
                "\n" +
                "Example: \"It is okay to make jokes during class, but you are carrying it a bit too far.\"\n" +
                "\n" +
                "Doing it a little bit may be okay, but you are doing it too much when you \"carry it too far\".\n" +
                "\n" +
                "Example: \"April Fool's jokes are fun, but putting salt in my coffee was carrying it a bit too far.\"\n" +
                "\n" +
                "Example: \"I know you kids were just trying to have fun, but you carried it a bit too far.\" ", apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.carrying_it_a_little_bit));
        ImageList.add(new ImageVO("Cash And Carry","\n" +
                "Cash and carry is when you buy the item and then you leave with it.\n" +
                "\n" +
                "Example: \"Sorry but there is nowhere to eat here. It is cash and carry.\"\n" +
                "\n" +
                "Example: \"There is no place to sit down and eat. It is cash and carry only.\"\n" +
                "\n" +
                "Cash and carry means you pay for it and you take it with you", apps.myapp.eze.ezenglish2.R.drawable.c, apps.myapp.eze.ezenglish2.R.drawable.cash_and_carry));

        //Expressions in D
        ImageList.add(new ImageVO("Digging Your Own Grave","\"Digging your own grave\" is doing things that will cause you to fail.\n" +
                "\n" +
                "Example: \"Talking to the boss like that, you are digging your own grave.\"\n" +
                "\n" +
                "What you are doing will result in a big loss for you\n" +
                "\n" +
                "Example: \"Come to my class without doing your homework is digging your own grave.\"\n" +
                "\n" +
                "You are hurting yourself by your own actions when you are digging your own grave.\n" +
                "\n" +
                "You should not be doing what you are doing when you are \"digging your own grave\" because that thing could cause a big loss for you.\n" +
                "\n" +
                "Example: \"Talking to the boss like that, you are digging your own grave.\"\n" +
                "\n" +
                "You are hurting only yourself - not others - with what you are doing when you are \"digging your own grave\". ", apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO("Dirty Work","Dirty work is work which makes a person unclean, which can also mean doing bad things.\n" +
                "\n" +
                "Example: \"You want me to fire her for you? Hey, do your own dirty work.\" ", apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO("Do One's Own Thing","Doing your own thing means doing what you want to do, not just what others want you to do.\n" +
                "\n" +
                "Example: \"My brother has always been like that. He does his own thing.\" ", apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO("Do One's Part","\n" +
                "Doing your part is sharing in the work to help the team.\n" +
                "\n" +
                "Example: \"Hey, I did my part.\" ", apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO("Do So","Do so means do that thing, do what we just said.\n" +
                "\n" +
                "Example: \"I would like to take a break.\" Reply: \"Now is a good time. Do so.\" ", apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO("Doing As You're Told","Some parents tell their children \"do as you are told\" as a reminder that they should do the thing that the parent has told them to do.\n" +
                "\n" +
                "Example: \"I want to stay up. I am not tired.\" Reply: \"Do as you are told and go to bed right now.\" ", apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO("Doing The Job","Example: \"I can't stop the water from coming out.\" Reply: \"Turn that switch over there, and that will do the job.\"\n" +
                "\n" +
                "Example: \"Smack it on the side. That should do the job.\"\n" +
                "\n" +
                "Example: \"That should do the job.\" ", apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO("Doing The Trick ( fix the problem ... )","\"Doing the trick\" is succeeding in solving a problem.\n" +
                "\n" +
                "Example: \"My motorcycle is not running well.\" Reply: \"Try replacing the oil. That might do the trick.\"\n" +
                "\n" +
                "Example: \"That will do the trick.\"\n" +
                "\n" +
                "The thing that \"does the trick\" is the thing that fixes the problem.\n" +
                "\n" +
                "Example: \"The teacher was not going to let me take the day off, but my mom called and that did the trick.\"\n" +
                "\n" +
                "Example: \"That should do the trick.\"\n" +
                "\n" +
                "Note that \"doing a trick\" (with the word \"a\") means something different from \"doing the trick\" (with the word \"the\"). Using the word \"a\" in \"doing a trick\", means pretending to do something that is impossible such as a \"card trick\". Using the word \"the\" in \"doing the trick\" means finding a way to do something that was difficult.\n" +
                "\n" +
                "Example: \"How did you stop the leak?\" Reply: \"We just turned off the water. That did the trick.\"\n" +
                "\n" +
                "\"Doing the trick\" is solving the problem so the thing that \"does the trick\" is the thing that solves the problem.\n" +
                "\n" +
                "Example: \"She wasn't breathing so we gave her CPR and that did the trick.\" ", apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO("Doing Wonders","\"Doing wonders\" is being a great success and creating wonderful results.\n" +
                "\n" +
                "Example: \"We hired her to clean our house once a week and she has done wonders.\"\n" +
                "\n" +
                "Example: \"She is very dedicated teacher and she has done wonders with her students.\"\n" +
                "\n" +
                "Example: \"You must try this skin cream. I started using it a year ago, and it has done wonders.\" ", apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO("Doing Your Homework","Doing your homework is doing what you need to do to prepare yourself.\n" +
                "\n" +
                "Example: \"John is an excellent lawyer. He always does his homework.\"\n" +
                "\n" +
                "\"Doing your homework\" is getting ready by doing what you need to do and learning what you need to learn. ", apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO("Doing Your Stuff","( doing that special thing which you are good at doing ... )\n" +
                "Example: \"There are five minutes left in this game. John, it is time for you to do your stuff.\"", apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO("Don't Burn Your Bridges","Our relationships with others are like bridges that take us from one place to another; when we \"burn our bridges\" we destroy our relationships and it is difficult to go back.\n" +
                "\n" +
                "Example: \"On his last day on the job he got in a huge fight with his boss.\" Answer: \"Why would he want to go burning his bridges like that? Someday he might want to work there again.\"\n" +
                "\n" +
                "\"Don't burn your bridges\" means that it is important to remember and value the relationships that get you where you are and not damage those relationships.\n" +
                "\n" +
                "Example: \"I wish you hadn't been rude to that man just now; he is very important in this town and you shouldn't go around burning bridges.\" ", apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO("Don't Count Your Chickens (Until They've Hatched)","( Don't make plans based on uncertain events ... )\n" +
                "\"Don't count your chickens until they're hatched\" means that you can hope certain things happen in the future, but you cannot know for sure that they will happen until they actually do happen.\n" +
                "\n" +
                "Example: \"Do you think that Bill is going to offer you a promotion this month?\" Reply: \"I won't count my chickens until they have hatched.\"\n" +
                "\n" +
                "\"Chickens\" start out as eggs, and you can count the eggs, but not all of the eggs will hatch to become chickens. \"Don't count your chickens until they've hatched\" means don't make plans based on something happening until that thing has already happened.\n" +
                "\n" +
                "Example: \"Next Friday I will finally be able to pay you back that money I owe you.\" Reply: \"Ha. I won't count my chickens until they have hatched.\"\n" +
                "\n" +
                "\"Don't count your chickens until they've hatched\" means that you should not count on something happening until you are sure that it will happen. ", apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO("Don't Put All Your Eggs In One Basket","( Don't risk everything all at once ... )\n" +
                "To \"put all your eggs in one basket\" is to risk losing everything all at one time.\n" +
                "\n" +
                "Example: \"My father is a very careful investor; he never puts all of his eggs in one basket.\"\n" +
                "\n" +
                "If you had a certain number of \"eggs\", it would be safest to put those eggs in different \"baskets\" and not \"put them all in one basket\". To \"put all your eggs in one basket\" would be to risk losing all of your \"eggs\" in case you drop that one \"basket\".\n" +
                "\n" +
                "Example: \"The best way to gamble is to only bet small amounts of money and never put all your eggs in one basket.\"\n" +
                "\n" +
                "Example: \"We know that you want to become an actor and we support you, but we still want you to graduate from college. Don't put all your eggs in one basket.\" ", apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO("Down On Someone Or Something","People are down on you when they are treating you badly and finding problems with you or what you do.\n" +
                "\n" +
                "Example: \"You have been down on me all day!\"\n" +
                "\n" +
                "Example: \"It feels like everybody has been down on me at work today.\" ", apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        ImageList.add(new ImageVO("Down The Hatch","\"Down the hatch\" is what people say when they want you to drink the whole glass at once.\n" +
                "\n" +
                "Example: \"You want me to drink this whole thing?\" Reply: \"That's right. Down the hatch!\" ", apps.myapp.eze.ezenglish2.R.drawable.d, apps.myapp.eze.ezenglish2.R.drawable.d));
        //ImageList.add(new ImageVO("","",R.drawable.commonwords));
    }
    public void onClick(View view) {

        switch (view.getId()){
            case apps.myapp.eze.ezenglish2.R.id.btnList: Utilities.visualization = Utilities.LIST;
                break;
            case apps.myapp.eze.ezenglish2.R.id.btnGrid: Utilities.visualization = Utilities.GRID;
                break;
        }
        ConstructRecycler();
    }
    private void ConstructRecycler() {
        ImageList =new ArrayList<>();
        ImageRecycler = findViewById(apps.myapp.eze.ezenglish2.R.id.RecyclerId);

        if (Utilities.visualization == Utilities.LIST){
            ImageRecycler.setLayoutManager(new LinearLayoutManager(this));
        }else {
            ImageRecycler.setLayoutManager(new GridLayoutManager(this,3));
        }

        fillContent();

        AdaptorImages adapter=new AdaptorImages(ImageList);

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        ImageList.get
                                (ImageRecycler.getChildAdapterPosition(view))
                                .getInfo(),Toast.LENGTH_LONG).show();
            }
        });

        ImageRecycler.setAdapter(adapter);
    }
}
