package conf.switches

import conf.switches.Expiry.never

trait DiscussionSwitches {
  val DiscussionAllPageSizeSwitch = Switch(
    SwitchGroup.Discussion,
    "discussion-all-page-size",
    "If this is switched on then users will have the option to load all comments",
    owners = Seq(Owner.withGithub("johnduffell")),
    safeState = Off,
    sellByDate = never,
    exposeClientSide = true
  )

  val DiscussionAllowAnonymousRecommendsSwitch = Switch(
    SwitchGroup.Discussion,
    "discussion-allow-anonymous-recommends-switch",
    "if this is switched on, comments can be recommended by signed out users",
    owners = Seq(Owner.withGithub("NathanielBennett")),
    safeState = Off,
    sellByDate = never,
    exposeClientSide = true
  )

  val DiscussionFetchExternalAssets = Switch(
    SwitchGroup.Discussion,
    "discussion-fetch-external-assets",
    "if this is switched on, discussion external assets map is fetched regularly",
    owners = Seq(Owner.withGithub("piuccio")),
    safeState = Off,
    sellByDate = never,
    exposeClientSide = false
  )
}
