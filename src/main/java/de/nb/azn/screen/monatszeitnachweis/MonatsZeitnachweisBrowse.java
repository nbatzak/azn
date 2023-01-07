package de.nb.azn.screen.monatszeitnachweis;

import io.jmix.core.DataManager;
import io.jmix.core.TimeSource;
import io.jmix.ui.action.Action;
import io.jmix.ui.screen.*;
import de.nb.azn.entity.MonatsZeitnachweis;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("MonatsZeitnachweis.browse")
@UiDescriptor("monats-zeitnachweis-browse.xml")
@LookupComponent("monatsZeitnachweisesTable")
public class MonatsZeitnachweisBrowse extends StandardLookup<MonatsZeitnachweis> {
    @Autowired
    private DataManager dataManager;
    @Autowired
    private TimeSource timeSource;

    @Subscribe("monatsZeitnachweisesTable.create")
    public void onMonatsZeitnachweisesTableCreate(Action.ActionPerformedEvent event) {
        MonatsZeitnachweis monatsZeitnachweis = dataManager.create(MonatsZeitnachweis.class);
        monatsZeitnachweis.setDatum(timeSource.now().toLocalDate());
        dataManager.save(monatsZeitnachweis);
        getScreenData().loadAll();
    }
}