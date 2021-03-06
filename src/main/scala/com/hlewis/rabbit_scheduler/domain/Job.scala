package com.hlewis.rabbit_scheduler.domain

case class Job(header: Header, body: Body)

case class Header(reference: String, jobType: String, cron: Cron, dispatch: Map[String, String])

case class Body(data: Map[String, Any])
