package mage.cards.p;

import mage.abilities.effects.common.CreateTokenEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.game.permanent.token.PestToken;

import java.util.UUID;

/**
 * @author TheElk801
 */
public final class PestSummoning extends CardImpl {

    public PestSummoning(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{1}{B/G}{B/G}");

        this.subtype.add(SubType.LESSON);

        // Create two 1/1 black and green Pest creature tokens with "When this creature dies, you gain 1 life."
        this.getSpellAbility().addEffect(new CreateTokenEffect(new PestToken(), 2));
    }

    private PestSummoning(final PestSummoning card) {
        super(card);
    }

    @Override
    public PestSummoning copy() {
        return new PestSummoning(this);
    }
}