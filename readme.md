# Learnings
##Agenda-Group
Agenda-Group needs to be set to the session using :  `kieSession.getAgenda().getAgendaGroup("DEBIT").setFocus();`
All rules belonging to Agenda group, that matches the criteria, will be fired. Rest agenda-group rules are ignored.

##Activation-Group
Activation-Group need not be explicilty set to session
Only one rule, that from matches the criteria from given activation-group, will be fired
If multiple rules for an activation-group match the criteria, then rule with highest Prioirty (Saliance) will be fired.

##Further Observations
####Agenda-Group and activation-group can coexist in a single decision table.
<pre>
When criteria matches,
    If one activation-group is present
        The all agenda-group rules are fired
        single rule from activation-group will be fired which has the highest priority
        Activation-Group results override over agenda-groups.
    If more than one activation-group is present
        then results from activation-group with highest priority will override all other results.
    If one rule has no Prioirty set
        then the rule takes the highest priority, irrespecitive of Agenda-Group group is set or not
    If one rule has the Prioirty set but no agenda-group set
        then the results is from the rule activation-group with highest priority prevails</pre>
        