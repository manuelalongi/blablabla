package manuel.alongi.bot.command;

import manuel.alongi.bot.service.AmazonPollerService;
import manuel.alongi.bot.service.GamestopPollerService;
import manuel.alongi.bot.service.MediaworldPollerService;
import manuel.alongi.bot.service.UnieuroPollerService;
import org.springframework.beans.factory.annotation.Autowired;

@Log4j
public class OrchestratorImpl implements Orchestrator {
    @Autowired
    private AmazonPollerService amazonPollerService;

    @Autowired
    private GamestopPollerService gamestopPollerService;

    @Autowired
    private MediaworldPollerService mediaworldPollerService;

    @Autowired
    private UnieuroPollerService unieuroPollerService;

    @Override
    public void run() {

    }
}
